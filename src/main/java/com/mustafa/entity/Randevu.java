package com.mustafa.entity;

import com.mustafa.utility.enums.Durum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_randevu")
public class Randevu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    Date randevuTarihi;

    private String doktorAdi;

    private String hastaAdi;

    private String tcNo;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Durum durum = Durum.AKTIF;


}
