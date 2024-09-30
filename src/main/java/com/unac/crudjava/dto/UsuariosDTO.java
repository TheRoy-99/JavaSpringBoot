package com.unac.crudjava.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UsuariosDTO {
    private Long id;
    private String userdame;
    private String password;
    private Date birthdate;
}
