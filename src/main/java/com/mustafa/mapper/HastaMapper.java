package com.mustafa.mapper;

import com.mustafa.dto.request.HastaLoginRequestDto;
import com.mustafa.dto.request.RegisterRequestDto;
import com.mustafa.dto.response.DoktorLoginResponseDto;
import com.mustafa.dto.response.HastaLoginResponseDto;
import com.mustafa.dto.response.RegisterResponseDto;
import com.mustafa.entity.Doktor;
import com.mustafa.entity.Hasta;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface HastaMapper {
    HastaMapper INSTANCE = Mappers.getMapper(HastaMapper.class);

    HastaLoginResponseDto fromHastaToLoginResponseDto(final Hasta hasta);

    Hasta fromRequestDtoToHasta(final HastaLoginRequestDto dto);

}
