package dev.jfranco.magalu.repository;

import dev.jfranco.magalu.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status,Long> {
}
