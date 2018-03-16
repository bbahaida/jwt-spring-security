package com.bahaida.jwtsecurity.backend.persistence.repositories;

import com.bahaida.jwtsecurity.backend.persistence.domain.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByRole(String role);
}
