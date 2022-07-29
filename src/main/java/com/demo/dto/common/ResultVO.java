package com.demo.dto.common;

import com.demo.dto.constant.ResultEnum;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class ResultVO<T> {
    private Integer code;
    private String msg;
    private T data;

    public ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public ResultVO() {}

    public static <T> ResultVO<T> success(T data) {
        return new ResultVO<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMsg(), data);
    }

    public static <T> ResultVO<T> fail(String msg) {
        if (StringUtils.isNotEmpty(msg)) {
            return new ResultVO<>(ResultEnum.FAIL.getCode(), msg, null);
        }
        return new ResultVO<>(ResultEnum.FAIL.getCode(), ResultEnum.FAIL.getMsg(), null);
    }

}
