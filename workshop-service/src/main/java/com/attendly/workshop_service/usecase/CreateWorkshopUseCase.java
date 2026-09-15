package com.attendly.workshop_service.usecase;

import com.attendly.workshop_service.domain.model.Workshop;
import com.attendly.workshop_service.port.in.CreateWorkshop;
import com.attendly.workshop_service.port.out.WorkshopRepository;

public class CreateWorkshopUseCase implements CreateWorkshop {

    private final WorkshopRepository workshopRepository;

    public CreateWorkshopUseCase(WorkshopRepository workshopRepository) {
        this.workshopRepository = workshopRepository;
    }

    @Override
    public CreateWorkshopOutput create(CreateWorkshopInput input) {

        Workshop workshop = Workshop.create(input.name(), input.description(), input.scheduledAt());

        workshopRepository.save(workshop);

        return new CreateWorkshopOutput(
                workshop.id(),
                workshop.name(),
                workshop.description(),
                workshop.scheduledAt(),
                workshop.registeredAt(), workshop.status()
        );
    }
}
