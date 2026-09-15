package com.attendly.workshop_service.adapter.in.web;

import com.attendly.workshop_service.port.in.CreateWorkshop;
import com.attendly.workshop_service.usecase.CreateWorkshopInput;
import com.attendly.workshop_service.usecase.CreateWorkshopOutput;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/workshops")
public class WorkshopController {

    private final CreateWorkshop createWorkshop;

    public WorkshopController(CreateWorkshop createWorkshop) {
        this.createWorkshop = createWorkshop;
    }

    @PostMapping
    public ResponseEntity<WorkshopResponse> create (@RequestBody WorkshopRequest request){

        CreateWorkshopInput input = new CreateWorkshopInput(
                request.name(),
                request.description(),
                request.scheduledAt()
        );

        CreateWorkshopOutput createWorkshopOutput = createWorkshop.create(input);

        WorkshopResponse response = new WorkshopResponse(createWorkshopOutput.id(),
                createWorkshopOutput.name(),
                createWorkshopOutput.description(),
                createWorkshopOutput.scheduledAt(),
                createWorkshopOutput.registeredAt(),
                createWorkshopOutput.status()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
}
