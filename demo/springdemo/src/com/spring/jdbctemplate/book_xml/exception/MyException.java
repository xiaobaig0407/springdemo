package com.spring.jdbctemplate.book_xml.exception;

/**
 *
 * @package com.spring.jdbctemplate.book.exception
 * @author baiyutao
 * @date 2020/6/15 下午4:17
 * @version 1.0
 */
public class MyException extends RuntimeException{

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression,
                       boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
