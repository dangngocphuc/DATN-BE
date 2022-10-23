package com.example.daphoneapple.domain.exeption;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExceptionConfig extends RuntimeException{
    private String message;

    public ExceptionConfig(String message){
        this.message = message;
    }
}
