package com.attendly.workshop_service.adapter.in.web;

import java.time.OffsetDateTime;

public record WorkshopRequest(String name, String description, OffsetDateTime scheduledAt){
}
