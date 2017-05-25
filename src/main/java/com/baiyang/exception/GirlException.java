package com.baiyang.exception;

import com.baiyang.domain.Girl;
import com.baiyang.enums.ResultEnum;

/**
 * Created by popla on 2017/5/25.
 */
public class GirlException extends RuntimeException{

    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();

    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
