package com.eucalyptus.web.vo;

import lombok.Data;

@Data
public class ReturnValue {     
	
	/* 상태코드 */
	private StatusEnum status;
	/* 상태 메시지 */ 
    private String message;
    /* return Data */
    private Object data;
	
    public ReturnValue() {
        this.status = StatusEnum.BAD_REQUEST;
        this.data = null;
        this.message = null;
    }
    
    public enum StatusEnum {

        OK(200, "OK"),
        BAD_REQUEST(400, "BAD_REQUEST"),
        NOT_FOUND(404, "NOT_FOUND"),
        INTERNAL_SERER_ERROR(500, "INTERNAL_SERVER_ERROR");

        int statusCode;
        String code;

        StatusEnum(int statusCode, String code) {
            this.statusCode = statusCode;
            this.code = code;
        }
    }
	
}
