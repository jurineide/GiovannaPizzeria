package br.com.giovannapizzeria.giovannaPizzeria.service;

import br.com.giovannapizzeria.giovannaPizzeria.model.Pizza;
import br.com.giovannapizzeria.giovannaPizzeria.repository.PizzaRepository;
import br.com.giovannapizzeria.giovannaPizzeria.repository.PizzariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;

import java.util.List;
import java.util.stream.Collectors;

public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    //salvar, listar, remover, buscar, listarNomesPizzasDisponiveis

    public void save(Pizza pizza) {
        pizzaRepository.save(pizza);
    }

    public Iterable<Pizza> list(){
        return pizzaRepository.findAll();
    }

    public Object findById(Long id) {
        return pizzaRepository.findById(id);
    }

    public void delete(Long id){
        pizzaRepository.deleteById(id);
    }

    public List<String> listavailablePizzasNames(){
        List<Pizza> pizzas = pizzaRepository.findAll();


        List<String> nomesPizzas = pizzas.stream().map((pizza)->{
            return pizza.getName();
        }).sorted().collect(Collectors.toList());

        return nomesPizzas;
    }

}
