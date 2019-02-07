package com.otakuy.otakuymusic.exception;

import com.otakuy.otakuymusic.model.Result;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnsupportedFormatException extends RuntimeException {
    private Result result;
}