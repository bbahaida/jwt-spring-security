package com.bahaida.jwtsecurity.backend.persistence.repositories;

import com.bahaida.jwtsecurity.backend.persistence.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
