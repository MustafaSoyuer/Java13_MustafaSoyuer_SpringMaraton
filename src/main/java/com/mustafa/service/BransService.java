package com.mustafa.service;

import com.mustafa.entity.Brans;
import com.mustafa.repository.BransRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BransService {
    private final BransRepository bransRepository;

    public Boolean add(String bransAd) {
        Brans brans = Brans.builder()
                .ad(bransAd)
                .build();
        bransRepository.save(brans);
        return true;
    }


    public List<Brans> findAll() {
        return bransRepository.findAll();
    }
}
