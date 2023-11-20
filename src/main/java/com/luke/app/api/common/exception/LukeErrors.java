package com.luke.app.api.common.exception;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class LukeErrors implements Serializable {
    private int code;
    private String message;
    private List<LukeError> errors = new ArrayList<>();

    @JsonCreator
    public LukeErrors(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public void add(String path, int code, String message) {
        this.errors.add(new LukeError(path, code, message));
    }
}

