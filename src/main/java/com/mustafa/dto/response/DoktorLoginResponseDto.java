package com.mustafa.dto.response;


import com.mustafa.utility.enums.Unvan;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoktorLoginResponseDto {
    String ad;
    Unvan unvan;
}
