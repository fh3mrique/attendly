package com.attendly.collaborator_service.adapter.out.persistence;

import com.attendly.collaborator_service.domain.model.enums.CollaboratorStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Entity
@Table(name = "collaborators")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CollaboratorJpaEntity {

    @Id
    private UUID id;
    private String name;
    @Enumerated(EnumType.STRING)
    CollaboratorStatus status;

}

