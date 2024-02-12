package com.mustafa.entity;

import com.mustafa.utility.enums.Cinsiyet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_hasta")
public class Hasta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String ad;

    @Column(unique = true,length = 11)
    private String tcNo;

    @Column(length = 15,unique = true)
    private String telefon;

    @Column(length = 20)
    private String adres;

    private Integer yas;

    @Enumerated(EnumType.STRING)
    private Cinsiyet cinsiyet;
}
