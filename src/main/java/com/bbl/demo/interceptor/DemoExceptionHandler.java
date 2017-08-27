package com.bbl.demo.interceptor;

import com.bbl.demo.exception.CodeException;
import com.bbl.demo.exception.ErrorMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class DemoExceptionHandler {
    @ExceptionHandler(value = CodeException.class)
    public ErrorMessage hadleCodeException(HttpServletRequest request, CodeException exception) throws Exception {
        return new ErrorMessage(exception.getCode(), exception.getMessage());
    }
}
