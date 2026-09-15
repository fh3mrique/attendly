package com.attendly.workshop_service.adapter.in.web;

import com.attendly.workshop_service.domain.enums.WorkshopStatus;

import java.time.OffsetDateTime;
import java.util.UUID;

public record WorkshopResponse (UUID id, String name, String description, OffsetDateTime scheduledAt, OffsetDateTime registeredAt, WorkshopStatus status) {
}
