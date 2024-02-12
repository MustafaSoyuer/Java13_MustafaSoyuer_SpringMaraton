package com.mustafa.dto.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoktorLoginRequestDto {

    @Email
    @NotNull
    String email;

    @Size(min = 5,max = 20,message = "Şifre en az 8 karakterde olusmalıdır.")
    String sifre;
}
