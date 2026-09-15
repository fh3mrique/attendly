package com.attendly.workshop_service.adapter.out.persistence;

import com.attendly.workshop_service.domain.model.Workshop;
import com.attendly.workshop_service.port.out.WorkshopRepository;
import org.springframework.stereotype.Repository;

@Repository
public class WorkshopPersistenceAdapter implements WorkshopRepository {

    private final WorkshopJpaRepository repository;

    public WorkshopPersistenceAdapter (WorkshopJpaRepository repository){
        this.repository = repository;
    }


    @Override
    public Workshop save(Workshop workshop) {

        WorkshopJpaEntity entity = new WorkshopJpaEntity(
                workshop.id(),
                workshop.name(),
                workshop.description(),
                workshop.scheduledAt(),
                workshop.registeredAt(),
                workshop.status()
                );

        WorkshopJpaEntity savedEntity = repository.save(entity);

     return Workshop.rehydrate(
                savedEntity.getId(),
                savedEntity.getName(),
                savedEntity.getDescription(),
                savedEntity.getScheduledAt(),
                savedEntity.getRegisteredAt(),
                savedEntity.getStatus()
        );
    }
}
