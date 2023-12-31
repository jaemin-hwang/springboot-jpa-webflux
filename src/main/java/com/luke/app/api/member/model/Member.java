package com.luke.app.api.member.model;

import com.luke.app.api.common.model.BaseEntity;
import com.luke.app.api.member.constant.Gender;
import com.luke.app.api.member.constant.MemberStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "member_luke")
public class Member extends BaseEntity {

    @Column(unique = true)
    private String username;

    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String realName;
    private String nickName;

    private String email;

    private Gender gender;
    private String birthday;

    private MemberStatus status;
    private Long leavedAt;


    private String phoneNumber;

    private Integer pointAccount = 0;


}
