package com.bank.profile.mapper;

import com.bank.profile.dto.RegistrationDto;
import com.bank.profile.entity.RegistrationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RegistrationMapper {

    RegistrationMapper INSTANCE = Mappers.getMapper(RegistrationMapper.class);

    RegistrationEntity toEntity(RegistrationDto registrationDto);

    RegistrationDto toDto(RegistrationEntity registrationEntity);
}