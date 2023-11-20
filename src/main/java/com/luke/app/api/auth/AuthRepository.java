package com.luke.app.api.auth;

import com.luke.app.api.common.model.ActiveType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends CrudRepository<Auth, Long> {

    Auth findByUsername(String username);

    Auth findByUsernameAndActive(String username, ActiveType active);

    Auth findByIdAndActive(Long memberId, ActiveType active);
}