package com.attendly.workshop_service.usecase;

import com.attendly.workshop_service.domain.enums.WorkshopStatus;

import java.time.OffsetDateTime;
import java.util.UUID;

public record CreateWorkshopOutput(UUID id, String name, String description,OffsetDateTime scheduledAt, OffsetDateTime registeredAt, WorkshopStatus status) {
}
