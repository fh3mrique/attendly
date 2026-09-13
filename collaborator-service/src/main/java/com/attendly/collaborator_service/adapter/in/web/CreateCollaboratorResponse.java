package com.attendly.collaborator_service.adapter.in.web;

import com.attendly.collaborator_service.domain.model.enums.CollaboratorStatus;

import java.util.UUID;

public record CreateCollaboratorResponse(
        UUID id,
        String name,
        CollaboratorStatus status
) {
}
