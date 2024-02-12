package com.mustafa.mapper;

import com.mustafa.dto.request.RandevuSaveRequestDto;
import com.mustafa.dto.response.RandevuSaveResponseDto;
import com.mustafa.entity.Randevu;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RandevuMapper {
    RandevuMapper INSTANCE = Mappers.getMapper(RandevuMapper.class);

    RandevuSaveResponseDto fromRandevuToResponseDto(final Randevu randevu);

    Randevu fromRequestDtoToRandevu(final RandevuSaveRequestDto dto);

}
