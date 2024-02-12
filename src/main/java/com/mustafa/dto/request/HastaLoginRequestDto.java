package com.mustafa.dto.request;

import com.mustafa.utility.enums.Cinsiyet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HastaLoginRequestDto {
    String ad;
    String tcNo;
    String telefon;
    String adres;
    Integer yas;
    Cinsiyet cinsiyet;
}
