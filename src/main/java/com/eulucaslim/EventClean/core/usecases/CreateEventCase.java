package com.eulucaslim.EventClean.core.usecases;

import com.eulucaslim.EventClean.core.entities.Event;

public interface CreateEventCase {
    Event execute(Event event);
}
