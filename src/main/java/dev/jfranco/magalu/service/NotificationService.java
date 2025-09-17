package dev.jfranco.magalu.service;

import dev.jfranco.magalu.dto.ScheduleNotification;
import dev.jfranco.magalu.repository.NotificationRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void sheduleNotification(ScheduleNotification dto) {
        notificationRepository.save(dto.toNotification());
    }

}
