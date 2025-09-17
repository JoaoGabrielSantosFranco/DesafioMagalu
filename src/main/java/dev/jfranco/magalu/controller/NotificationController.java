package dev.jfranco.magalu.controller;

import dev.jfranco.magalu.dto.ScheduleNotification;
import dev.jfranco.magalu.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> schedulerNotification(@RequestBody ScheduleNotification dto) {
        notificationService.sheduleNotification(dto);

        return ResponseEntity.accepted().build();
    }

}
