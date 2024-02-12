package com.mustafa.controller;

import com.mustafa.entity.Brans;
import com.mustafa.service.BransService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.mustafa.constant.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(BRANS)
public class BransController {
    private final BransService bransService;

    @PostMapping(ADD)
    public ResponseEntity<Boolean> add(@RequestBody String bransAd){
        return ResponseEntity.ok(bransService.add(bransAd));
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<Brans>> getAll(){
        return ResponseEntity.ok(bransService.findAll());
    }
}
