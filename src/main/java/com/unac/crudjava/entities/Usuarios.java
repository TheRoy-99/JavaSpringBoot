package com.unac.crudjava.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "usuarios")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Usuarios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username" ,unique = true )
    private String username;
    private String password;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "status")
    private Boolean status;
}
