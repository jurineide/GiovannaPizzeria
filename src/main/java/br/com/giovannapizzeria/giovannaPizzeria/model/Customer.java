package br.com.giovannapizzeria.giovannaPizzeria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Customer {

    @NotNull
    @NotBlank
    @Column(unique=true)
    private String login;

    @NotBlank @NotEmpty
    private String password;

    @Transient
    @NotNull @NotEmpty
    private String passwordConfirmation;

    @NotNull
    private Calendar dataCadastro;

    @NotNull
    private String phoneNumber;

    @NotNull
    private Address address;

}
