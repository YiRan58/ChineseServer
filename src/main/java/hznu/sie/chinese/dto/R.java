package hznu.sie.chinese.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class R<T> {

    public static final Integer Success = 0;

    public static final Integer Error = 1;

    private Integer code;

    private String errMsg;

    private T data;

    public Integer getCode() {
        return code;
    }

    public R<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public R<T> setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

    public T getData() {
        return data;
    }

    public R<T> setData(T data) {
        this.data = data;
        return this;
    }

    public static <T> R<T> ok(T data) {
        return new R<T>().setCode(Success).setData(data);
    }

    public static R ok() {
        return new R().setCode(Success);
    }

    public static <T> R<T> err(String errMsg, T data) {
        return new R<T>().setCode(Error).setErrMsg(errMsg).setData(data);
    }

    public static <T> R<T> err(String msg) {
        return new R<T>().setCode(Error).setErrMsg(msg);
    }

}
