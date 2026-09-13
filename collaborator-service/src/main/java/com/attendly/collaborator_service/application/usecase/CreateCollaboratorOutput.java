package com.attendly.collaborator_service.application.usecase;

import com.attendly.collaborator_service.domain.enums.CollaboratorStatus;

import java.util.UUID;

public record CreateCollaboratorOutput(UUID id, String nome, CollaboratorStatus status) {
}
