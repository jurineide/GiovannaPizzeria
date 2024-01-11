package br.com.giovannapizzeria.giovannaPizzeria.service;

import br.com.giovannapizzeria.giovannaPizzeria.model.Ingredient;
import br.com.giovannapizzeria.giovannaPizzeria.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    public void save(Ingredient ingredient){
        ingredientRepository.save(ingredient) ;
    }

    public void deleteById(Long id){
        ingredientRepository.deleteById(id);
    }

    public Iterable<Ingredient> list(){
        return ingredientRepository.findAll();
    }

    public Object findById(Long id){
        return ingredientRepository.findById(id);
    }

}
