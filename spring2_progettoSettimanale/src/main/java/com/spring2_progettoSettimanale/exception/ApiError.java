package com.spring2_progettoSettimanale.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ApiError {

    private final String message;
    private final HttpStatus status;

}