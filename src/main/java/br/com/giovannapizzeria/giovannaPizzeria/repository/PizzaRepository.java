package br.com.giovannapizzeria.giovannaPizzeria.repository;

import br.com.giovannapizzeria.giovannaPizzeria.model.Pizza;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PizzaRepository extends CrudRepository<Pizza, Long> {

    List<Pizza> findAll();


}
