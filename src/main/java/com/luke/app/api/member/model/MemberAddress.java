package com.luke.app.api.member.model;

import com.luke.app.api.common.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
public class MemberAddress extends BaseEntity {

    private Long memberId;
    private Boolean idDefault;
    private String title;
    private String postNumber;
    private String address1;
    private String address2;
    private String address1Second;
    private AddressType addressType;

}
