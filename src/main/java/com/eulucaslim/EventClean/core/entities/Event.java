package com.eulucaslim.EventClean.core.entities;

import com.eulucaslim.EventClean.core.enums.EventType;
import java.time.LocalDateTime;

public record Event(
        Long id,
        String name,
        String description,
        String identifier,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String localEvent,
        Integer capacity,
        String organizer,
        EventType type
) {
}
