package com.bank.profile.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.security.Timestamp;

import lombok.*;

@Entity
@Table(name = "audit")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Entity type is required")
    @Size(max = 50, message = "Entity type should not exceed 50 characters")
    @Column(name = "entity_type", nullable = false)
    private String entityType;

    @NotBlank(message = "Operation type is required")
    @Size(max = 20, message = "Operation type should not exceed 20 characters")
    @Column(name = "operation_type", nullable = false)
    private String operationType;

    @NotBlank(message = "Created by is required")
    @Size(max = 50, message = "Created by should not exceed 50 characters")
    @Column(name = "created_by", nullable = false)
    private String createdBy;

    @NotBlank(message = "Modified by is required")
    @Size(max = 50, message = "Modified by should not exceed 50 characters")
    @Column(name = "modified_by")
    private String modifiedBy;

    @NotNull(message = "Created at is required")
    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    @NotNull(message = "Modified at is required")
    @Column(name = "modified_at")
    private Timestamp modifiedAt;

    @NotBlank(message = "New entity JSON is required")
    @Column(name = "new_entity_json")
    private String newEntityJson;

    @NotBlank(message = "Entity JSON is required")
    @Column(name = "entity_json", nullable = false)
    private String entityJson;
}