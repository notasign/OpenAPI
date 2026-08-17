package com.notasign.open.api.resp.bulksend;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.notasign.open.api.bean.base.BaseResp;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 批量发送任务统计响应（字段由服务端动态返回，统一收纳到statistics映射中）
 */
public class BulkSendTaskStatisticsResp extends BaseResp {

    private final Map<String, Object> statistics = new LinkedHashMap<>();

    @JsonAnyGetter
    public Map<String, Object> getStatistics() {
        return statistics;
    }

    @JsonAnySetter
    public void addStatistic(String key, Object value) {
        statistics.put(key, value);
    }
}
