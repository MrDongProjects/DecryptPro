package com.decrypt.enums;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class R<T> implements Serializable {

    private static final long serialVersionUID = 8004487252556526569L;

    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 响应码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应数据
     */
//    private Map<String, Object> data = new HashMap<>();
    private T data;

    /**
     * 响应时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;

    // 构造器私有
    private R(){}

    // 通用返回成功
    public static R ok() {
        R r = new R();
        r.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        r.setCode(ResultCodeEnum.SUCCESS.getCode());
        r.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        r.setTime(new Date());
        return r;
    }

    // 通用返回失败，未知错误
    public static R error() {
        R r = new R();
        r.setSuccess(ResultCodeEnum.FAIL.getSuccess());
        r.setCode(ResultCodeEnum.FAIL.getCode());
        r.setMessage(ResultCodeEnum.FAIL.getMessage());
        r.setTime(new Date());
        return r;
    }

    // 设置结果，形参为结果枚举
    public static R setResult(ResultCodeEnum result) {
        R r = new R();
        r.setSuccess(result.getSuccess());
        r.setCode(result.getCode());
        r.setMessage(result.getMessage());
        r.setTime(new Date());
        return r;
    }

    /**------------使用链式编程，返回类本身-----------**/
    
    // 自定义返回数据
//    public R data(T map) {
//        this.setData(map);
//        return this;
//    }

    /**
    public R data(String key,Object value) {
        this.data.put(key, value);
        return this;
    }
    */

    // 通用设置data
    public R data(T value) {
        this.data = (T) value;
        return this;
    }

    // 自定义状态信息
    public R message(String message) {
        this.setMessage(message);
        return this;
    }

    // 自定义状态码
    public R code(Integer code) {
        this.setCode(code);
        return this;
    }

    // 自定义返回结果
    public R success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    public R time(Date time) {
        this.setTime(time);
        return this;
    }

    @JsonIgnore
    public boolean isOk() {
        return false;
    }

}