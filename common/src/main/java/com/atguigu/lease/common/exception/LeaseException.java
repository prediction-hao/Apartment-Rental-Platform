package com.atguigu.lease.common.exception;

import com.atguigu.lease.common.result.ResultCodeEnum;
import lombok.Data;

/**
 * @author wanna
 * @create 2025 -05 -17 -10:06 PM
 */
@Data
public class LeaseException extends RuntimeException {
    //异常状态码
    private Integer code;
    /**
     * 通过状态码和错误消息创建异常对象
     * @param message
     * @param code
     */
    public LeaseException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    /**
     * 根据响应结果枚举对象创建异常对象
     * @param resultCodeEnum
     */
    public LeaseException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "LeaseException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
