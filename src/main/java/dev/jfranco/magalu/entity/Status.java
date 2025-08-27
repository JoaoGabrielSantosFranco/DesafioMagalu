package dev.jfranco.magalu.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_status")
@Data
@NoArgsConstructor
public class Status {

    public Status(long statusId, String description) {
        this.statusId = statusId;
        this.description = description;
    }

    @Id
    private long statusId;

    private String description;


    public enum values {
        PENDING(1L, "pending"),
        SUCCESS(2L, "success"),
        ERROR(3L, "error"),
        CANCELED(4L, "canceled");

        private long id;
        private String description;

        values(Long id, String description) {
            this.id = id;
            this.description = description;
        }

        public Status toStatus(){
            return new Status(id,description);
        }

    }
}
