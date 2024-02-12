package com.mustafa.dto.response;


import com.mustafa.utility.enums.Cinsiyet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HastaLoginResponseDto {
    String ad;
    String tcNo;
    Integer yas;
    Cinsiyet cinsiyet;
}
