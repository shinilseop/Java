package chapter8_exception;

public class UnsupportedFunctionException extends Exception {
    private int error_code;
    public UnsupportedFunctionException(String msg, int error_code) {
        super(msg);
        this.error_code=error_code;
    }

    public UnsupportedFunctionException(String msg) {
        this(msg, 100);
    }

    public int getErrorCode() {
        return error_code;
    }

    @Override
    public String getMessage() {
        return "["+getErrorCode()+"]"+super.getMessage();
    }
}
