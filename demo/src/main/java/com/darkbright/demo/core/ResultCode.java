package com.darkbright.demo.core;

import java.util.ArrayList;
import java.util.List;

public enum ResultCode {
    /* 成功状态码 */
    SUCCESS(1, "成功"),
    
    /* 参数错误：10001-19999 */
    PARAM_IS_INVALID(101, "参数无效"),
    PARAM_IS_BLANK(102, "参数为空"),
    PARAM_TYPE_ERROR(103, "参数类型错误"),
    PARAM_NOT_COMPLETE(104, "参数缺失"),
    PARAM_NOT_FIT(105,"参数不符合预期"),
    
    /* 用户错误：201-299*/
    USER_NO_LOGIN(201, "用户未登录"),
    USER_LOGIN_ERROR(202, "账号不存在或密码错误"),
    USER_ACCOUNT_FORBIDDEN(203, "账号已被禁用"),
    USER_NOT_EXIST(204, "用户不存在"),
    USER_HAS_EXISTED(205, "用户已存在"),
    USER_REGISTER_ERROR(206, "用户注册失败"),
    USER_EMAIL_HAS_EXIST(207, "邮箱已使用"),

    /* 业务错误：301-399 */
    SPECIFIED_QUESTIONED(301, "某业务出现问题"),
    COMMAND_EXECUTION_FAILED(302, "命令执行失败"),
    
    /* 系统错误：401-499 */
    SYSTEM_INNER_ERROR(401, "系统内部错误"),
    SYSTEM_BUSY(402, "系统繁忙，请稍后重试"),
    
    /* 数据错误：501-5999 */
    DATA_NO_FOUND(501, "数据未找到"),
    DATA_IS_WRONG(502, "数据有误"),
    DATA_ALREADY_EXISTED(503, "数据已存在"),
    FILE_NOT_EXISTED(504, "文件夹不存在"),

    /* 接口错误：601-699 */
    INTERFACE_INNER_INVOKE_ERROR(601, "内部系统接口调用异常"),
    INTERFACE_OUTER_INVOKE_ERROR(602, "外部系统接口调用异常"),
    INTERFACE_FORBID_VISIT(603, "该接口禁止访问"),
    INTERFACE_ADDRESS_INVALID(604, "接口地址无效"),
    INTERFACE_REQUEST_TIMEOUT(605, "接口请求超时"),
    INTERFACE_EXCEED_LOAD(606, "接口负载过高"),
    
    /* 权限错误：701-799 */
    PERMISSION_NO_ACCESS(701, "无访问权限"),
    
    UNKNOWN_ERROR(0, "未知错误");
    
    private Integer code;
    
    private String message;
    
    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    
    public Integer code() {
        return this.code;
    }
    
    public String message() {
        return this.message;
    }
    
    public static String getMessage(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }
    
    public static Integer getCode(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        return this.name();
    }
    
    //校验重复的code值
    public static void main(String[] args) {
        ResultCode[] ApiResultCodes = ResultCode.values();
        List<Integer> codeList = new ArrayList<>();
        for (ResultCode ApiResultCode : ApiResultCodes) {
            if (codeList.contains(ApiResultCode.code)) {
                System.out.println(ApiResultCode.code);
            } else {
                codeList.add(ApiResultCode.code());
            }
        }
    }
}
