package com.mustafa.repository;

import com.mustafa.entity.Hasta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HastaRepository extends JpaRepository<Hasta,Long> {
}
