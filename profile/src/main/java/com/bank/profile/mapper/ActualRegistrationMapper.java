package com.bank.profile.mapper;

import com.bank.profile.dto.ActualRegistrationDTO;
import com.bank.profile.entity.ActualRegistrationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActualRegistrationMapper {

    ActualRegistrationDTO toDTO(ActualRegistrationEntity entity);

    ActualRegistrationEntity toEntity(ActualRegistrationDTO dto);
}