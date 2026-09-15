package com.attendly.workshop_service.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WorkshopJpaRepository extends JpaRepository<WorkshopJpaEntity, UUID> {
}
