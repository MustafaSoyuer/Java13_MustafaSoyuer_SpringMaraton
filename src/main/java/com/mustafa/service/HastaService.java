package com.mustafa.service;

import com.mustafa.dto.request.HastaLoginRequestDto;
import com.mustafa.dto.response.HastaLoginResponseDto;
import com.mustafa.entity.Hasta;
import com.mustafa.mapper.HastaMapper;
import com.mustafa.repository.HastaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HastaService {
    private final HastaRepository hastaRepository;
    public HastaLoginResponseDto login(HastaLoginRequestDto dto) {
        Hasta hasta = HastaMapper.INSTANCE.fromRequestDtoToHasta(dto);
        hastaRepository.save(hasta);
        return HastaMapper.INSTANCE.fromHastaToLoginResponseDto(hasta);
    }

}
