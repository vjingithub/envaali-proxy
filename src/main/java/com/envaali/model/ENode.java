package com.envaali.model;

public class ENode {

    public String getName() {
        return name;
    }

    public String getNodeType() {
        return nodeType;
    }

    public String getDescription() {
        return description;
    }

    public String getNodeMime() {
        return nodeMime;
    }

    public String getTag() {
        return tag;
    }

    private final String name;
    private final String nodeType;  // parent | Child
    private final String description;
    private final String nodeMime;
    private final String tag;

    private ENode(Builder builder) {
        this.name = builder.name;
        this.nodeType = builder.nodeType;
        this.description = builder.description;
        this.nodeMime = builder.nodeMime;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        String name;
        String nodeType;  // parent | Child
        String description;
        String nodeMime;
        String tag;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder nodeMime(String nodeMime) {
            this.nodeMime = nodeMime;
            return this;
        }

        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public ENode build() {
            return new ENode(this);
        }
    }
}
