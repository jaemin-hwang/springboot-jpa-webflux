package com.luke.app.api.member.constant;

public enum Gender {

    MALE("M"),
    FEMALE("F");

    Gender(final String codeValue) {
        this.codeValue = codeValue;
    }

    private String codeValue;

    public String getCode() {
        return codeValue;
    }



}
