package cn.xinyue365.common;

import lombok.Data;

/**
 * @author frank
 */
@Data
public abstract class AbstractResponse<T> {

    private int result;
    private String msg;
    private T data;

    public AbstractResponse() {
    }
}
