package main.java.org.choongang.commons;

import org.springframework.http.HttpStatus;

public class BadRequestException extends CommonException {

    public BadRequestException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
