package com.hp.lead.dto;

import lombok.Data;

@Data
public class ResponseWrapper {

    private String status;
    private Object data;

    public ResponseWrapper(String status, Object data) {
        this.status = status;
        this.data = data;
    }
}
