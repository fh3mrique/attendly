package com.attendly.workshop_service.usecase;

import java.time.OffsetDateTime;

public record CreateWorkshopInput(String name, String description, OffsetDateTime scheduledAt) {
}
