package com.decrypt.enums;

import lombok.Getter;

@Getter
public enum ResultCodeEnum {

    /**
     * 操作成功
     **/
    SUCCESS(true,200, "操作成功"),
    /**
     * 非法访问
     **/
    UNAUTHORIZED(true,401, "非法访问"),
    /**
     * 没有权限
     **/
    NOT_PERMISSION(true,403, "没有权限"),
    /**
     * 你请求的资源不存在
     **/
    NOT_FOUND(true,404, "你请求的资源不存在"),
    /**
     * 操作失败
     **/
    FAIL(true,500, "操作失败"),
    /**
     * 登录失败
     **/
    LOGIN_EXCEPTION(true,4000, "登录失败"),
    /**
     * 系统异常
     **/
    SYSTEM_EXCEPTION(true,5000, "系统异常"),
    /**
     * 请求参数校验异常
     **/
    PARAMETER_EXCEPTION(true,5001, "请求参数校验异常"),
    /**
     * 请求参数解析异常
     **/
    PARAMETER_PARSE_EXCEPTION(true,5002, "请求参数解析异常"),
    /**
     * HTTP内容类型异常
     **/
    HTTP_MEDIA_TYPE_EXCEPTION(true,5003, "HTTP内容类型异常"),
    /**
     * 系统处理异常
     **/
    SPRING_BOOT_PLUS_EXCEPTION(true,5100, "系统处理异常"),
    /**
     * 业务处理异常
     **/
    BUSINESS_EXCEPTION(true,5101, "业务处理异常"),
    /**
     * 数据库处理异常
     **/
    DAO_EXCEPTION(true,5102, "数据库处理异常"),
    /**
     * 验证码校验异常
     **/
    VERIFICATION_CODE_EXCEPTION(true,5103, "验证码校验异常"),
    /**
     * 登录授权异常
     **/
    AUTHENTICATION_EXCEPTION(true,5104, "登录授权异常"),
    /**
     * 没有访问权限
     **/
    UNAUTHENTICATED_EXCEPTION(true,5105, "没有访问权限"),
    /**
     * 没有访问权限
     **/
    UNAUTHORIZED_EXCEPTION(true,5106, "没有访问权限"),
    /**
     * JWT Token解析异常
     **/
    JWTDECODE_EXCEPTION(true,5107, "Token解析异常"),

    /**
     * 方法不支持异常
     **/
    HTTP_REQUEST_METHOD_NOT_SUPPORTED_EXCEPTION(true,5108, "METHOD NOT SUPPORTED"),

    /**
     * 空指针异常
     **/
    NULL_POINT(true,5109, "空指针异常"),

    /**
     * HTTP客户端异常
     **/
    HTTP_CLIENT_ERROR(true,5110, "HTTP客户端异常"),
    ;

    // 响应是否成功
    private Boolean success;
    // 响应状态码
    private Integer code;
    // 响应信息
    private String message;

    ResultCodeEnum(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}