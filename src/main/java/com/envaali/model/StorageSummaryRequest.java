package com.envaali.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class StorageSummaryRequest {

    @NotEmpty
    String bucketName;
}
