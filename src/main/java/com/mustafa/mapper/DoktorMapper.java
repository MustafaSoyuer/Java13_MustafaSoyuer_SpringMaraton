package com.mustafa.mapper;

import com.mustafa.dto.request.DoktorLoginRequestDto;
import com.mustafa.dto.request.RegisterRequestDto;
import com.mustafa.dto.response.DoktorLoginResponseDto;
import com.mustafa.dto.response.RegisterResponseDto;
import com.mustafa.entity.Doktor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DoktorMapper {
    DoktorMapper INSTANCE = Mappers.getMapper(DoktorMapper.class);

    DoktorLoginResponseDto fromDoktorToLoginResponseDto(final Doktor doktor);

    Doktor fromRegisterRequestDtoToDoktor(final RegisterRequestDto dto);

    RegisterResponseDto fromDoktorToRegisterResponseDto(final Doktor doktor);
}
