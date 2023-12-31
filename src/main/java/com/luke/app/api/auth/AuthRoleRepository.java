package com.luke.app.api.auth;

import com.luke.app.api.common.model.ActiveType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRoleRepository extends CrudRepository<AuthRole, Long> {
    AuthRole findByAuthIdAndActive(Long memberId, ActiveType active);

}