package dev.jfranco.magalu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_status")
@Data
public class Status {

    public Status(long statusId, String description) {
        this.statusId = statusId;
        this.description = description;
    }

    @Id
    private long statusId;

    private String description;


    public enum Values {
        PENDING(1L, "pending"),
        SUCCESS(2L, "success"),
        ERROR(3L, "error"),
        CANCELED(4L, "canceled");

        private long id;
        private String description;

        Values(Long id, String description) {
            this.id = id;
            this.description = description;
        }

    }
}
