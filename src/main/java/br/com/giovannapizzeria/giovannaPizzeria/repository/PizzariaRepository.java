package br.com.giovannapizzeria.giovannaPizzeria.repository;

import br.com.giovannapizzeria.giovannaPizzeria.model.Pizzaria;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzariaRepository extends CrudRepository<Pizzaria, Long> {

    @Query("SELECT p FROM Pizzaria p WHERE p.usuario.login = ?")
    public Pizzaria findOneByLogin(String login);


}
