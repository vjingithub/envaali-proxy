package com.envaali.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ENodeBuilder {
    private  String name;
    private  String nodeType;  // parent | Child
    private  String description;
    private  String nodeMime;
    private  String tag;
}
