package com.bank.profile.mapper;

import com.bank.profile.dto.AuditDto;
import com.bank.profile.entity.AuditEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuditMapper {

    AuditDto toDto(AuditEntity entity);

    AuditEntity toEntity(AuditDto dto);

    List<AuditDto> toDtoList(List<AuditEntity> entities);

    List<AuditEntity> toEntityList(List<AuditDto> dtos);
}