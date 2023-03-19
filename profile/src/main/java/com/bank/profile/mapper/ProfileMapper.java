package com.bank.profile.mapper;
import com.bank.profile.dto.ProfileDto;
import com.bank.profile.entity.Profile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    ProfileDto toDto(Profile profile);

    Profile toEntity(ProfileDto profileDto);
}