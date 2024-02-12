package com.mustafa.controller;

import com.mustafa.dto.request.DoktorLoginRequestDto;
import com.mustafa.dto.request.RegisterRequestDto;
import com.mustafa.dto.response.DoktorLoginResponseDto;
import com.mustafa.dto.response.RegisterResponseDto;
import com.mustafa.entity.Doktor;
import com.mustafa.service.DoktorService;
import com.mustafa.utility.enums.Durum;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static com.mustafa.constant.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(DOKTOR)
public class DoktorController {

    private final DoktorService doktorService;

    @PostMapping(ADD)
    public ResponseEntity<RegisterResponseDto> register(@RequestBody RegisterRequestDto dto){
        return ResponseEntity.ok(doktorService.register(dto));
    }

    @PostMapping(LOGIN)
    public ResponseEntity<DoktorLoginResponseDto> login(@RequestBody DoktorLoginRequestDto dto){
        return ResponseEntity.ok(doktorService.login(dto));
    }

    @GetMapping("/durum")
    public Map<String , Durum> durum(){
        return doktorService.findByDurum();
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<Doktor>> getAll(){
        return ResponseEntity.ok(doktorService.findAll());
    }

}
