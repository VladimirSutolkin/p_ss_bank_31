package com.bank.profile.mapper;

import com.bank.profile.dto.PassportDto;
import com.bank.profile.entity.Passport;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PassportMapper {

    PassportDto toDto(Passport passport);

    Passport toEntity(PassportDto passportDto);
}