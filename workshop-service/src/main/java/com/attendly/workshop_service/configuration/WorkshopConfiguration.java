package com.attendly.workshop_service.configuration;

import com.attendly.workshop_service.port.in.CreateWorkshop;
import com.attendly.workshop_service.port.out.WorkshopRepository;
import com.attendly.workshop_service.usecase.CreateWorkshopUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorkshopConfiguration {

    @Bean
    public CreateWorkshop createWorkshop(
            WorkshopRepository workshopRepository) {

        return new CreateWorkshopUseCase(workshopRepository);
    }
}