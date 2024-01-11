package br.com.giovannapizzeria.giovannaPizzeria.model;

import br.com.giovannapizzeria.giovannaPizzeria.enumerator.StatusOrder;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Customer customer;

    private List<Pizza> pizzas;

    private List<Drink> drinks;

    private String exclusion;

    private StatusOrder statusOrder;
}
