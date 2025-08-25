package dev.jfranco.magalu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import javax.swing.event.ChangeEvent;

@Entity
@Table(name = "tb_channel")
@Data
public class Channel {

    public Channel(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    @Id
    private Long id;

    private String description;

    public enum values{
        EMAIL(1L,"email"),
        SMS(2L,"sms"),
        PUSH(3L,"push"),
        WHATSAPP(4L,"whatsapp");

        private long id;
        private String description;

        values(Long id, String description){
            this.id = id;
            this.description = description;
        }
    }

    public Channel toChanel(){
        return new Channel(id,description);
    }
}
