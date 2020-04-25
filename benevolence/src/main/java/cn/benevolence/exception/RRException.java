package cn.benevolence.exception;

/**
 * 自定义异常类
 * @author xianshan
 * @create 2020-02 10:52
 */
public class RRException extends RuntimeException{
    public RRException() {
        super();
    }

    public RRException(String message) {
        super(message);
    }

    public RRException(String message, Throwable cause) {
        super(message, cause);
    }

    public RRException(Throwable cause) {
        super(cause);
    }

    protected RRException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
