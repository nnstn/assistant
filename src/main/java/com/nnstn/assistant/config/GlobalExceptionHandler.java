package com.nnstn.assistant.config;
import com.nnstn.assistant.domain.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value=Exception.class)
    public Result allExceptionHandler(HttpServletRequest request,Exception exception) throws Exception{

        logger.error("请求路径："+request.getRequestURI());
        logger.error("本地消息："+exception.getLocalizedMessage());
        logger.error("报错原因："+exception.getCause());
        logger.error("异常超类："+exception.getSuppressed());
        logger.error("错误信息："+exception.getMessage());
        logger.error("错误堆栈："+exception.getStackTrace());
        exception.printStackTrace();
        return  new Result(500,exception.getMessage(),exception.getCause());
    }  

    /**
     * 400 - Bad Request
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Result handleMissingServletRequestParameterException(MissingServletRequestParameterException e) {
      logger.error("缺少请求参数", e);
      return Result.error();
    }
}