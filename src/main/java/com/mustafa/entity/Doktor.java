package com.mustafa.entity;

import com.mustafa.utility.enums.Durum;
import com.mustafa.utility.enums.Unvan;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_doktor")
public class Doktor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String ad;

    private String adres;

    @Column(length = 15)
    private String telefon;

    @Email
    private String email;

    @Size(min=5, max = 20)
    private String sifre;

    private Long bransId;

    @Enumerated(EnumType.STRING)
    private Unvan unvan;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private Durum durum = Durum.HASTASI_YOK;

//    @OneToMany(mappedBy = "doktor", cascade = CascadeType.ALL)
//    private List<Randevu> randevular;

}
