package com.luke.app.api.common.model;

import lombok.Data;

import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public class BaseView implements Serializable {

    private Long id;
    private ActiveType active;
    private Long updatedAt;
    private Long createdAt;
    private Long createdId;
    private Long updatedId;


}
