package com.attendly.collaborator_service.application.usecase;

import com.attendly.collaborator_service.domain.model.Collaborator;
import com.attendly.collaborator_service.port.in.CreateCollaborator;
import com.attendly.collaborator_service.port.out.CollaboratorRepository;

public class CreateCollaboratorUseCase implements CreateCollaborator {

    private CollaboratorRepository collaboratorRepository;

    public CreateCollaboratorUseCase (CollaboratorRepository collaboratorRepository){
        this.collaboratorRepository = collaboratorRepository;
    }


    @Override
    public CreateCollaboratorOutput create(CreateCollaboratorInput input) {

        Collaborator collaborator = Collaborator.create(input.name());


        collaboratorRepository.save(collaborator);
        //publicar evento

        return new CreateCollaboratorOutput(
                collaborator.id(),
                collaborator.name(),
                collaborator.status()
        );

    }
}
