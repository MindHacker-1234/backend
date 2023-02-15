package org.example.exception;

import com.mysql.cj.exceptions.ExceptionInterceptor;

import java.sql.SQLException;

public class Exception {
    public static SQLException translateException(Throwable ex, ExceptionInterceptor exceptionInterceptor) {
        return translateException(ex, (ExceptionInterceptor)null);
    }
}
