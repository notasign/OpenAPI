# Nota Sign OpenApi Java SDK v1 说明

# 简介

欢迎使用Nota Sign开发者工具套件（SDK），Java SDK 是Nota Sign电子签云服务开放平台（Nota Sign OPEN API）的配套工具。

SDK已上传至中央仓库，直接通过Maven安装Nota Sign OpenApi Java SDK：

```xml
<dependency>
    <groupId>com.notasign.api</groupId>
    <artifactId>global-openapi-java-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```


# 模块说明

- SDK统一使用NotaSignClient请求客户端进行API请求，具体的业务接口根据 com.notasign.open.api.req下的请求参数进行请求：

| 模块             | 模块中文名 | 模块说明      |
|----------------|-------|-----------|
| NotaSignClient | 接口调用  | 统一接口调用客户端 |

# 依赖环境

JAVA JDK 版本: JDK 1.7-1.8

# 安装说明

## 引用jar包
引入sdk 所依赖的jar包，提供全流程的方法，提供的方法调用云端Nota Sign的api服务。

```text
    <dependency>
        <groupId>org.apache.httpcomponents</groupId>
        <artifactId>httpclient</artifactId>
        <version>4.5.12</version>
    </dependency>
    <dependency>
        <groupId>org.apache.httpcomponents</groupId>
        <artifactId>httpmime</artifactId>
        <version>4.5.8</version>
    </dependency>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.10.1</version>
    </dependency>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-log4j12</artifactId>
        <version>1.7.25</version>
    </dependency>
    <dependency>
        <groupId>commons-logging</groupId>
        <artifactId>commons-logging</artifactId>
        <version>1.2</version>
    </dependency>
    <dependency>
         <groupId>com.nimbusds</groupId>
         <artifactId>nimbus-jose-jwt</artifactId>
        <version>10.3</version>
     </dependency>

```

## 初始化客户端

项目启动后必须先进行初始化，才能调用jar包方法。初始化仅需一次，之后可重复使用。

Nota Sign平台分配的appId，appSecret，API请求地址在初始化时作为入参传入，请求超时配置、序列化策率可以初始化后设置。

```java
        //法大大分配的appId
        String appId="xxxxx";
        //法大大分配的appId对应的秘钥
        String appSecret="xxxxx";
        //API请求地址
        String serverUrl="";
        //用户授权码
        String userCode="xxxxx";
        // 初始化客户端
        NotaSignClient notaSignClient = new NotaSignClient(appId,appSecret,serverUrl,userCode);

        // http超时配置设置， 默认不设置超时时间
        // 如果不设置超时时间 该设置可忽略
        HttpConfig httpConfig=new HttpConfig();
        httpConfig.setConnectTimeout(1000000);
        httpConfig.setReadTimeout(1000000);
        notaSignClient.setHttpConfig(httpConfig);

        // Json序列化策率，默认使用Jackson，如果要使用其他如FastJson,Gson等实现JsonStrategy接口即可
        // 如果使用默认该设置可以忽略
        notaSignClient.setJsonStrategy(new DefaultJsonStrategy());
```

## 业务方法调用

业务方法调用主要是根据com.notasign.open.api.req下对应的请求类进行调用，以查询信封详情方法调用为例展示调用过程：

```java
        //获取accessToken
        String privateKey = "xxxxxxxxxxxxxxxxxxxxxx";
        String jwtStr = OauthJwtUtil.generateAccessTokenJwt(privateKey, APP_ID, USER_CODE, "api.nota.com", 10000L, null);
        
        AccessTokenReq accessTokenReq = new AccessTokenReq();
        accessTokenReq.setAssertion(jwtStr);
        accessTokenReq.setGrantType(OauthGrantTypeEnum.JWT.getCode());
        ApiResponse<GetAccessTokenResp> result = notaSignClient.execute(accessTokenReq);
        String accessToken = result.getData().getAccessToken();
        // 初始化业务客户端
        ServiceClient serviceClient=new ServiceClient(openApiClient);
        
        BaseRes<AccessTokenRes> res=serviceClient.getAccessToken();
        String accessToken=res.getData().getAccessToken();

        String envelopeId = "xxxxxxxx";
        // 获取企业用户授权链接
        GetEnvelopeReq getEnvelopeReq = new GetEnvelopeReq();
        getEnvelopeReq.setAccessToken(accessToken);
        getEnvelopeReq.setEnvelopeId(envelopeId);
        ApiResponse<EnvelopeDetailResp> detail = client.execute(getEnvelopeReq);

```

更多示例详见demo代码()



# 参考

Nota Sign OpenAPI (服务端) 接口文档
