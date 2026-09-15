package com.attendly.workshop_service.adapter.out.persistence;

import com.attendly.workshop_service.domain.enums.WorkshopStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "workshops")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class WorkshopJpaEntity {
    @Id
    private UUID id;
    private String name;
    private String description;
    private OffsetDateTime scheduledAt;
    private OffsetDateTime registeredAt;
    @Enumerated(EnumType.STRING)
    private WorkshopStatus status;
}
