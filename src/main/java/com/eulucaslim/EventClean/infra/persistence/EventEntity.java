package com.eulucaslim.EventClean.infra.persistence;

import com.eulucaslim.EventClean.core.enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "event_tb")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String identifier;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String localEvent;
    private Integer capacity;
    private String organizer;
    private EventType type;

}
