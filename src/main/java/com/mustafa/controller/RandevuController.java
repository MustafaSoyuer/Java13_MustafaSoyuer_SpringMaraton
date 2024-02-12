package com.mustafa.controller;

import com.mustafa.dto.request.RandevuSaveRequestDto;
import com.mustafa.dto.response.RandevuSaveResponseDto;
import com.mustafa.entity.Randevu;
import com.mustafa.service.RandevuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.mustafa.constant.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(RANDEVU)
public class RandevuController {
    private final RandevuService randevuService;

    @PostMapping(RANDEVU_AL)
    public ResponseEntity<RandevuSaveResponseDto> randevuAl(@RequestBody RandevuSaveRequestDto dto){
        return ResponseEntity.ok(randevuService.randevuAl(dto));
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<Randevu>> getAll(){
        return ResponseEntity.ok(randevuService.findAll());
    }

    @GetMapping("get-all-hasta")
    public ResponseEntity<Map<String , Date >> doktorAdinaGoreHastalar (String doktorAdi){
        return ResponseEntity.ok(randevuService.findByDoktorAdi(doktorAdi));
    }
}
