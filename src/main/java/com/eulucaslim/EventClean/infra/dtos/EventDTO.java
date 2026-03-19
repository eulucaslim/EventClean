package com.eulucaslim.EventClean.infra.dtos;

import com.eulucaslim.EventClean.core.enums.EventType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record EventDTO(
        String name,
        String description,
        String identifier,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
        LocalDateTime startDate,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
        LocalDateTime endDate,
        String localEvent,
        Integer capacity,
        String organizer,
        EventType type
) { }
