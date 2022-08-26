package com.caprepa.API.prueba.exceptions;

import com.caprepa.API.prueba.dtos.ErrorDto;
import org.springframework.http.HttpStatus;

import java.util.Arrays;

public class NotFoundException extends BookingException{

    public static final long serialVersionUID = 1L;

    public NotFoundException(String code, String message) {
        super(code, HttpStatus.NOT_FOUND.value(),message);

    }

    public NotFoundException(String code, String message, ErrorDto data) {
        super(code, HttpStatus.NOT_FOUND.value(),message, Arrays.asList(data));
    }
}
