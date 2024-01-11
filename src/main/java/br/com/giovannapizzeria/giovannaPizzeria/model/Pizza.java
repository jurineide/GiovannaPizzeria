package br.com.giovannapizzeria.giovannaPizzeria.model;

import br.com.giovannapizzeria.giovannaPizzeria.enumerator.PizzaBorder;
import br.com.giovannapizzeria.giovannaPizzeria.enumerator.PizzaSize;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private BigDecimal price;

    @NotNull
    @Enumerated(EnumType.STRING)
    private PizzaSize size;

    @NotNull
    @Enumerated(EnumType.STRING)
    private PizzaBorder border;

    @ManyToMany
    private Map<Ingredient, Weight> ingredients;

    public String getName() {
        return name;
    }
}
