package com.attendly.workshop_service.domain.model;

import com.attendly.workshop_service.domain.enums.WorkshopStatus;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

public class Workshop {
    private UUID id;
    private String name;
    private String description;
    private OffsetDateTime scheduledAt;
    private OffsetDateTime registeredAt;
    private WorkshopStatus status;

    public Workshop(UUID id, String name, String description, OffsetDateTime scheduledAt, OffsetDateTime registeredAt, WorkshopStatus status) {
        setId(id);
        setName(name);
        setDescription(description);
        setScheduledAt(scheduledAt);
        setRegisteredAt(registeredAt);
        setStatus(status);
    }

    public static Workshop create(String name, String description, OffsetDateTime scheduledAt) {
        return new Workshop(
                UUID.randomUUID(),
                name,
                description,
                scheduledAt,
                OffsetDateTime.now(),
                WorkshopStatus.SCHEDULED
        );
    }

    public static Workshop rehydrate(
            UUID id,
            String name,
            String description,
            OffsetDateTime scheduledAt,
            OffsetDateTime registeredAt,
            WorkshopStatus status) {

        return new Workshop(
                id,
                name,
                description,
                scheduledAt,
                registeredAt,
                status
        );
    }

    private void setId(UUID id){
        Objects.requireNonNull(id);
        this.id = id;
    }

    private void setName(String name){
        Objects.requireNonNull(name);

        if (name.isBlank()){
            throw new IllegalArgumentException();
        }

        this.name = name;
    }

    private void setDescription(String description){
        Objects.requireNonNull(description);
        this.description = description;
    }

    private void setScheduledAt(OffsetDateTime scheduledAt){
        Objects.requireNonNull(scheduledAt);
        this.scheduledAt = scheduledAt;
    }

    private void setRegisteredAt(OffsetDateTime registeredAt){
        Objects.requireNonNull(registeredAt);
        this.registeredAt = registeredAt;
    }

    private void setStatus(WorkshopStatus status){
        Objects.requireNonNull(status);
        this.status = status;
    }


    public UUID id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    public OffsetDateTime scheduledAt() {
        return scheduledAt;
    }

    public WorkshopStatus status() {
        return status;
    }

    public OffsetDateTime registeredAt() {
        return registeredAt;
    }
}
