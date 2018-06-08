package pl.springintroduction.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.service.PizzaOrderService;

import java.util.List;

@RestController
@RequestMapping(path= "/pizzaorders")
public class PizzaOrderController {

    private final PizzaOrderService pizzaOrderService;

    @Autowired
    public PizzaOrderController(PizzaOrderService pizzaOrderService){
        this.pizzaOrderService = pizzaOrderService;
    }

    @RequestMapping(path = "/") //w requestmapping domyślnie jest metoda GET
    public List<PizzaOrder> getAllOrders(){
        return pizzaOrderService.findAll();

    }

    @GetMapping(path = "/{id}")//to jest to samo co requestMapping z metodą GET
    public PizzaOrder getOrder(@PathVariable Long id){
        return pizzaOrderService.findById(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.POST) //jeśli chcemy inną metodę, trzeba dodać 'method'
    public PizzaOrder createOrder(@RequestBody PizzaOrder pizzaOrder){ //@requestBody oznacza, że to co jest w body jest zamieniane na obiekt
        return pizzaOrderService.create(pizzaOrder);
    }
}
