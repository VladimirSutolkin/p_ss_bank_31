package com.bank.profile.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.security.Timestamp;

public class AuditDto {

    private Long id;

    @NotBlank(message = "Entity type is required")
    @Size(max = 50, message = "Entity type should not exceed 50 characters")
    private String entityType;

    @NotBlank(message = "Operation type is required")
    @Size(max = 20, message = "Operation type should not exceed 20 characters")
    private String operationType;

    @NotBlank(message = "Created by is required")
    @Size(max = 50, message = "Created by should not exceed 50 characters")
    private String createdBy;

    @NotBlank(message = "Modified by is required")
    @Size(max = 50, message = "Modified by should not exceed 50 characters")
    private String modifiedBy;

    @NotNull(message = "Created at is required")
    private Timestamp createdAt;

    @NotNull(message = "Modified at is required")
    private Timestamp modifiedAt;

    @NotBlank(message = "New entity JSON is required")
    private String newEntityJson;

    @NotBlank(message = "Entity JSON is required")
    private String entityJson;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getNewEntityJson() {
        return newEntityJson;
    }

    public void setNewEntityJson(String newEntityJson) {
        this.newEntityJson = newEntityJson;
    }

    public String getEntityJson() {
        return entityJson;
    }

    public void setEntityJson(String entityJson) {
        this.entityJson = entityJson;
    }
}