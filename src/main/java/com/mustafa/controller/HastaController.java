package com.mustafa.controller;

import com.mustafa.dto.request.HastaLoginRequestDto;
import com.mustafa.dto.response.HastaLoginResponseDto;
import com.mustafa.service.HastaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.mustafa.constant.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(HASTA)
public class HastaController {
    private final HastaService hastaService;

    @PostMapping(LOGIN) // bilgilerini girdikten sonra işlem yapmak isteyenler hastalar için, ayrıca randevuControllerdan direk giriş yapmadan da hasta kayıt edilebilir
    public ResponseEntity<HastaLoginResponseDto> login(@RequestBody HastaLoginRequestDto dto){
        return ResponseEntity.ok(hastaService.login(dto));
    }

}
