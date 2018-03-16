package com.bahaida.jwtsecurity.backend.persistence.repositories;

import com.bahaida.jwtsecurity.backend.persistence.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository  extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
