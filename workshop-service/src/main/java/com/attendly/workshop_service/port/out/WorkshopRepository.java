package com.attendly.workshop_service.port.out;

import com.attendly.workshop_service.domain.model.Workshop;

public interface WorkshopRepository {

    Workshop save (Workshop workshop);
}
