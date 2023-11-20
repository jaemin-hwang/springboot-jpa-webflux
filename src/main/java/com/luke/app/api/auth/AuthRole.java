package com.luke.app.api.auth;

import com.luke.app.api.common.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "luke_auth_role", uniqueConstraints = @UniqueConstraint(columnNames = {"auth_id", "role_id"}))
public class AuthRole extends BaseEntity {

    @Column(name = "auth_id")
    private Long authId;

    @Column(name = "role_id")
    private Long roleId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id", insertable = false, updatable = false)
    private Role role;
}
