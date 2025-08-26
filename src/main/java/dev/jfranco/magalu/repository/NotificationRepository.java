package dev.jfranco.magalu.repository;

import dev.jfranco.magalu.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
