package com.luke.app.api.sample.model;

import com.luke.app.api.common.model.BaseEntity;
import com.luke.app.api.sample.constant.SampleStatus;
import com.luke.app.api.common.model.BaseEntity;
import com.luke.app.api.sample.constant.SampleStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class Sample extends BaseEntity {

    private String title;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String contents;
    private SampleStatus status = SampleStatus.INIT;


}
