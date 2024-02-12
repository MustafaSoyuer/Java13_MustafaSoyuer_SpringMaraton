package com.mustafa.repository;

import com.mustafa.entity.Randevu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RandevuRepository extends JpaRepository<Randevu,Long> {

    List<Randevu> findByDoktorAdi(String doktorAdi);
}
