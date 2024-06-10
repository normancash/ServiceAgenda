package com.org.demoagenda.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@MappedSuperclass
@Data
public class IdentifiedId {
    @Id
    @UuidGenerator
    @Column(length = 32)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private UUID id;
}
