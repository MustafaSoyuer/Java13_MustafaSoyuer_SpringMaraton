package com.mustafa.repository;

import com.mustafa.entity.Doktor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoktorRepository extends JpaRepository<Doktor,Long> {
    Optional<Doktor> findOptionalByEmailAndSifre(String email, String sifre);

    Optional<Doktor> findByAd(String doktorAdi);
}
