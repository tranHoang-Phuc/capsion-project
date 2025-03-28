package com.fptu.sep490.commonlibrary.exceptions;

public class MultipartFileContentException extends RuntimeException {

    public MultipartFileContentException() {
        super();
    }

    public MultipartFileContentException(String errorMessage) {
        super(errorMessage);
    }

    public MultipartFileContentException(Throwable cause) {
        super(cause);
    }

    public MultipartFileContentException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
