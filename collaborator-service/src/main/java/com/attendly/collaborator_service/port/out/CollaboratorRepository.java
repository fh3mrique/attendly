package com.attendly.collaborator_service.port.out;


import com.attendly.collaborator_service.domain.model.Collaborator;

public interface CollaboratorRepository {

    Collaborator save (Collaborator collaborator);
}
