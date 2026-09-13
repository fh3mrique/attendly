package com.attendly.collaborator_service.adapter.in.web;

import com.attendly.collaborator_service.application.usecase.CreateCollaboratorInput;
import com.attendly.collaborator_service.application.usecase.CreateCollaboratorOutput;
import com.attendly.collaborator_service.port.in.CreateCollaborator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/collaborators")
public class CollaboratorController {

    private final CreateCollaborator createCollaborator;

    public CollaboratorController (CreateCollaborator createCollaborator){
        this.createCollaborator = createCollaborator;
    }

    @PostMapping()
    public ResponseEntity<CreateCollaboratorResponse> create (@RequestBody CreateCollaboratorRequest request){

        CreateCollaboratorInput input = new CreateCollaboratorInput(request.name());

        CreateCollaboratorOutput output = createCollaborator.create(input);

        CreateCollaboratorResponse response = new CreateCollaboratorResponse(output.id(), output.nome(), output.status());

        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
}
