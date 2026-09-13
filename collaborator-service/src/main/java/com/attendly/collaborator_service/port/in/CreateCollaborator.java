package com.attendly.collaborator_service.port.in;

import com.attendly.collaborator_service.application.usecase.CreateCollaboratorInput;
import com.attendly.collaborator_service.application.usecase.CreateCollaboratorOutput;

public interface CreateCollaborator {

    CreateCollaboratorOutput create(CreateCollaboratorInput input);
}
