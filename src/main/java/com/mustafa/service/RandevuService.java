package com.mustafa.service;

import com.mustafa.dto.request.RandevuSaveRequestDto;
import com.mustafa.dto.response.RandevuSaveResponseDto;
import com.mustafa.entity.Doktor;
import com.mustafa.entity.Hasta;
import com.mustafa.entity.Randevu;
import com.mustafa.mapper.RandevuMapper;
import com.mustafa.repository.DoktorRepository;
import com.mustafa.repository.HastaRepository;
import com.mustafa.repository.RandevuRepository;
import com.mustafa.utility.enums.Durum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RandevuService {
    private final RandevuRepository randevuRepository;
    private final DoktorRepository doktorRepository;

    public RandevuSaveResponseDto randevuAl(RandevuSaveRequestDto dto) {
        Optional<Doktor> doktor = doktorRepository.findByAd(dto.getDoktorAdi());
        Randevu randevu = RandevuMapper.INSTANCE.fromRequestDtoToRandevu(dto);
            randevu.setDoktorAdi(doktor.get().getAd());
            doktor.get().setDurum(Durum.HASTASI_VAR);
            randevuRepository.save(randevu);
        return RandevuMapper.INSTANCE.fromRandevuToResponseDto(randevu);
    }


    public List<Randevu> findAll(){
        return randevuRepository.findAll();
    }

    public Map<String, Date> findByDoktorAdi(String doktorAdi){
         List<Randevu> randevular = randevuRepository.findByDoktorAdi(doktorAdi);
        return randevular.stream()
                .collect(Collectors.toMap(x -> x.getHastaAdi(), y -> y.getRandevuTarihi()));
    }


}
