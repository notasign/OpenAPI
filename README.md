# Nota Sign OpenAPI Java SDK

## Introduction

Welcome to the Nota Sign Developer Toolkit. The Java SDK is the companion client library for the Nota Sign e-signature cloud open platform (Nota Sign Open API).

The SDK is published to Maven Central. Add the following dependency to your project to install it:

```xml
<dependency>
    <groupId>com.notasign.api</groupId>
    <artifactId>global-openapi-java-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Modules

All API requests are made through the unified `NotaSignClient`. Individual business APIs are invoked using the request classes under `com.notasign.open.api.req`:

| Module         | Description                              |
|----------------|------------------------------------------|
| NotaSignClient | Unified client for all API invocations   |

## Requirements

- Java JDK 1.7 – 1.8

## Installation

### Dependencies

Include the JAR dependencies required by the SDK. They provide the full set of methods for calling the Nota Sign cloud API services:

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

## Getting Started

### Initialize the Client

The client must be initialized once after your application starts, before any SDK method can be invoked. After initialization, the client instance can be reused throughout your application.

Pass in the `appId` and `privateKey` issued by the Nota Sign platform, along with the API endpoint, at initialization time. HTTP timeout settings and the JSON serialization strategy can be configured after initialization.

```java
// The appId assigned by Nota Sign
String appId = "xxxxx";
// The private key corresponding to the assigned appId
String privateKey = "xxxxx";
// API endpoint
String serverUrl = "";
// User authorization code
String userCode = "xxxxx";
// Initialize the client
NotaSignClient notaSignClient = new NotaSignClient(appId, privateKey, serverUrl, userCode);

// HTTP timeout configuration (no timeout by default; omit if not required)
HttpConfig httpConfig = new HttpConfig();
httpConfig.setConnectTimeout(1000000);
httpConfig.setReadTimeout(1000000);
notaSignClient.setHttpConfig(httpConfig);

// JSON serialization strategy. Jackson is used by default.
// To use FastJson, Gson, etc., simply implement the JsonStrategy interface.
// Omit this setting if the default is sufficient.
notaSignClient.setJsonStrategy(new DefaultJsonStrategy());
```

### Invoke a Business API

Business APIs are invoked through the corresponding request classes under `com.notasign.open.api.req`. The following example demonstrates the invocation flow by querying envelope details:

```java
// Obtain an access token
String privateKey = "xxxxxxxxxxxxxxxxxxxxxx";
String jwtStr = OauthJwtUtil.generateAccessTokenJwt(privateKey, APP_ID, USER_CODE, "api.nota.com", 10000L, null);

AccessTokenReq accessTokenReq = new AccessTokenReq();
accessTokenReq.setAssertion(jwtStr);
accessTokenReq.setGrantType(OauthGrantTypeEnum.JWT.getCode());
ApiResponse<GetAccessTokenResp> result = notaSignClient.execute(accessTokenReq);
String accessToken = result.getData().getAccessToken();

String envelopeId = "xxxxxxxx";
// Query envelope details
GetEnvelopeReq getEnvelopeReq = new GetEnvelopeReq();
getEnvelopeReq.setAccessToken(accessToken);
getEnvelopeReq.setEnvelopeId(envelopeId);
ApiResponse<EnvelopeDetailResp> detail = notaSignClient.execute(getEnvelopeReq);
```

## References

- [Nota Sign OpenAPI (Server-side) Documentation](https://developers.uat.notasign.com/api-docs/)

