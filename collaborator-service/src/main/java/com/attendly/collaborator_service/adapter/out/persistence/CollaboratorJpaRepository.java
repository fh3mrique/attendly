package com.attendly.collaborator_service.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CollaboratorJpaRepository extends JpaRepository<CollaboratorJpaEntity, UUID> {
}
