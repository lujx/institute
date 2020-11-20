package com.darkbright.frameworks.basic;

import java.io.Serializable;

/**
 * @author bright
 *
 */
public class ResultObj implements Serializable {
    
    private static final long serialVersionUID = -3948389268046368059L;
    
    private Integer code;
    
    private String msg;
    
    private Object data;
    
    public ResultObj() {}
    
    public ResultObj(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    
    public static ResultObj success() {
        ResultObj resultObj = new ResultObj();
        resultObj.setResultCode(ResultCode.SUCCESS);
        return resultObj;
    }
    
    public static ResultObj success(Object data) {
        ResultObj resultObj = new ResultObj();
        resultObj.setResultCode(ResultCode.SUCCESS);
        resultObj.setData(data);
        return resultObj;
    }
    
    public static ResultObj failure(ResultCode resultCode) {
        ResultObj resultObj = new ResultObj();
        resultObj.setResultCode(resultCode);
        return resultObj;
    }
    
    public static ResultObj failure(ResultCode resultCode, Object data) {
        ResultObj resultObj = new ResultObj();
        resultObj.setResultCode(resultCode);
        resultObj.setData(data);
        return resultObj;
    }
    
    public void setResultCode(ResultCode code) {
        this.code = code.code();
        this.msg = code.message();
    }
    
    public Object getData() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
}
