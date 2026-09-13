package com.attendly.collaborator_service.domain.model;


import com.attendly.collaborator_service.domain.enums.CollaboratorStatus;

import java.util.Objects;
import java.util.UUID;

public class Collaborator {

    private UUID id;
    private String name;
    private CollaboratorStatus status;

    public Collaborator (UUID id, String name, CollaboratorStatus status){
        setId(id);
        setName(name);
        setStatus(status);
    }

    public static Collaborator create(String name){
        return new Collaborator(
                UUID.randomUUID(),
                name,
                CollaboratorStatus.ACTIVE
        );
    }

    public UUID id() {
        return id;
    }

    public String name() {
        return name;
    }

    public CollaboratorStatus status() {
        return status;
    }

    private void setId(UUID id) {
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
    private void setStatus(CollaboratorStatus status){
        this.status = status;
    }
}
