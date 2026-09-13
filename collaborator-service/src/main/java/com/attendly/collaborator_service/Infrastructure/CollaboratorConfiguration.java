package com.attendly.collaborator_service.Infrastructure;

import com.attendly.collaborator_service.application.usecase.CreateCollaboratorUseCase;
import com.attendly.collaborator_service.port.in.CreateCollaborator;
import com.attendly.collaborator_service.port.out.CollaboratorRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollaboratorConfiguration {

    @Bean
    public CreateCollaborator createCollaborator(CollaboratorRepository repository){
        return new CreateCollaboratorUseCase(repository);
    }
}
