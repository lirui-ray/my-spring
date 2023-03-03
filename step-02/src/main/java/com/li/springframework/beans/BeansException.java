package com.li.springframework.beans;

/**
 * 作者：Lee
 *
 * 定义 Bean 异常
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
