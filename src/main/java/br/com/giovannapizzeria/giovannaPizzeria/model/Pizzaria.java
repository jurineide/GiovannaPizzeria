package br.com.giovannapizzeria.giovannaPizzeria.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

@Repository
public class Pizzaria {

    private static final long serialVersionUID = 96265543598833115L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @NotNull
    private List<Customer> customer;


    @NotNull @NotEmpty
    private String nome;

    @NotNull
    @NotEmpty
    private String endereco;

    @ElementCollection
    private Set<String> emails;

    @ElementCollection
    private Set<String> telefones;

    @OneToMany
    private Set<Pizza> pizzas;

}
