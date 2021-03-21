package com.envaali.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StorageSummaryResponse {

    public List<ENode> getSummeryS3() {
        return summeryS3;
    }

    private List<ENode> summeryS3;

    @JsonIgnoreProperties(ignoreUnknown = true)
    private String inoreTest;

    public StorageSummaryResponse(List<ENode> nodeList) {
        this.summeryS3 = nodeList;
    }
}
