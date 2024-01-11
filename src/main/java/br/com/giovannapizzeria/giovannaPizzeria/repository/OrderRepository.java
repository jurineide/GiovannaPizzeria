package br.com.giovannapizzeria.giovannaPizzeria.repository;

import br.com.giovannapizzeria.giovannaPizzeria.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long> {

    public Order findByCustomer(Long id);

    Order listByStatusOPEN();
}
