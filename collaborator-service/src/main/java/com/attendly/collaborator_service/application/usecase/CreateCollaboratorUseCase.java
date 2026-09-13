package com.attendly.collaborator_service.application.usecase;

import com.attendly.collaborator_service.domain.model.Collaborator;
import com.attendly.collaborator_service.port.in.CreateCollaborator;

public class CreateCollaboratorUseCase implements CreateCollaborator {


    @Override
    public CreateCollaboratorOutput create(CreateCollaboratorInput input) {

        Collaborator collaborator = Collaborator.create(input.name());


        //salva repositorio
        //publicar evento

        return new CreateCollaboratorOutput(
                collaborator.id(),
                collaborator.name(),
                collaborator.status()
        );

    }
}
