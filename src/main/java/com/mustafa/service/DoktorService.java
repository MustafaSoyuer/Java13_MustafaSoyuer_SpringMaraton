package com.mustafa.service;

import com.mustafa.dto.request.DoktorLoginRequestDto;
import com.mustafa.dto.request.RegisterRequestDto;
import com.mustafa.dto.response.DoktorLoginResponseDto;
import com.mustafa.dto.response.RegisterResponseDto;
import com.mustafa.entity.Doktor;
import com.mustafa.exception.ErrorType;
import com.mustafa.exception.HastaneManagerException;
import com.mustafa.mapper.DoktorMapper;
import com.mustafa.repository.DoktorRepository;
import com.mustafa.utility.enums.Durum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoktorService {
    private final DoktorRepository doktorRepository;


    public RegisterResponseDto register(RegisterRequestDto dto) {
        Doktor doktor = DoktorMapper.INSTANCE.fromRegisterRequestDtoToDoktor(dto);
        doktorRepository.save(doktor);
        return DoktorMapper.INSTANCE.fromDoktorToRegisterResponseDto(doktor);
    }

    public DoktorLoginResponseDto login(DoktorLoginRequestDto dto) {
        Optional<Doktor> doktor = doktorRepository.findOptionalByEmailAndSifre(dto.getEmail(), dto.getSifre());
        if (doktor.isEmpty()){
            throw new RuntimeException("Bu kullanıcı bulunamadı.");
        }
        if (!doktor.get().getEmail().equals(dto.getEmail()) && !doktor.get().getSifre().equals(dto.getSifre())) {
            throw new HastaneManagerException(ErrorType.ERROR_INVALID_LOGIN_PARAMETER);
        }
        return DoktorMapper.INSTANCE.fromDoktorToLoginResponseDto(doktor.get());
    }

    public Map<String, Durum> findByDurum(){
        return doktorRepository.findAll().stream().collect(Collectors.toMap(x->x.getAd(),y->y.getDurum()));
    }

    public List<Doktor> findAll() {
        return doktorRepository.findAll();
    }
}
