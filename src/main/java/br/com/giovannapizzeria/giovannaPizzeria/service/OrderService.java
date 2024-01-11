package br.com.giovannapizzeria.giovannaPizzeria.service;

import br.com.giovannapizzeria.giovannaPizzeria.model.Order;
import br.com.giovannapizzeria.giovannaPizzeria.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

    //crud
    @Autowired
    private OrderRepository orderRepository;

    public void save(Order order){
        orderRepository.save(order);
    }

    public void deleteById(Long id){
        orderRepository.deleteById(id);
    }

    public Iterable<Order> listAllOrders(){
        return orderRepository.findAll();
    }

    public Object findById(Long id){
        return orderRepository.findById(id);
    }

    public Order findByCustomer(Long id){
        return orderRepository.findByCustomer(id);
    }

    public Order listOrdersByStatusOpen(){
        return orderRepository.listByStatusOPEN();
    }

}
