package com.darkbright.demo.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * description here.
 *
 * @author boolo
 * @date 2019-01-14 14:40
 **/
public class ControllerAspect {
  private static final Logger logger = LoggerFactory.getLogger(ControllerAspect.class);
  /*public Object handleControllerMethod(ProceedingJoinPoint pjp){
    long startTime = System.currentTimeMillis();

    ResultObject<?> result;

    try {
      result = (ResultObject<?>) pjp.proceed();
      logger.info(pjp.getSignature() + "use time:" + (System.currentTimeMillis() - startTime));
    } catch (Throwable e) {
      result = handlerException(pjp, e);
    }

    return result;
  }

  *//**
   * 封装异常信息，注意区分已知异常（自己抛出的）和未知异常
   *//*
  private ResultObject<?> handlerException(ProceedingJoinPoint pjp, Throwable e) {
    ResultObject<?> result;

    // 已知异常
    if (e instanceof UnloginException) {
      result = ResultObject.failure(ResultCode.USER_NO_LOGIN);
    } else {
      logger.error(pjp.getSignature() + " error ", e);
      //TODO 未知的异常，应该格外注意，可以发送邮件通知等
      result = ResultObject.failure(ResultCode.UNKNOWN_ERROR);
    }

    return result;
  }*/
}
