package com.darkbright.demo.core.exception;

/**
 * description here.
 *
 * @author boolo
 * @date 2019-01-14 16:35
 **/
public class UnloginException extends Exception {
  static final long serialVersionUID = 7818375828146090153L;

  public UnloginException()
  {
    super();
  }

  public UnloginException(String message)
  {
    super(message);
  }

  public UnloginException(String message, Throwable cause)
  {
    super(message, cause);
  }

  public UnloginException(Throwable cause)
  {
    super(cause);
  }
}
