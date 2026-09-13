package com.attendly.collaborator_service.adapter.out.persistence;

import com.attendly.collaborator_service.domain.model.Collaborator;
import com.attendly.collaborator_service.port.out.CollaboratorRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CollaboratorPersistenceAdapter implements CollaboratorRepository {

    private final CollaboratorJpaRepository repository;

    public CollaboratorPersistenceAdapter (CollaboratorJpaRepository repository){
        this.repository = repository;
    }

    @Override
    public Collaborator save(Collaborator collaborator) {

        CollaboratorJpaEntity entity = new CollaboratorJpaEntity(
                collaborator.id(),
                collaborator.name(),
                collaborator.status()
        );

       CollaboratorJpaEntity collaboratorSaved = repository.save(entity);


        return  Collaborator.rehydrate(collaboratorSaved.getId(), collaboratorSaved.getName(), collaboratorSaved.status);
    }
}
