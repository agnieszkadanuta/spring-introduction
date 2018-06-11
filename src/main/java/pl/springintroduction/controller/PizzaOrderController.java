package pl.springintroduction.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.springintroduction.converter.PizzaOrderConverter;
import pl.springintroduction.model.PizzaOrder;
import pl.springintroduction.model.PizzaOrderDTO;
import pl.springintroduction.service.PizzaOrderService;

import java.util.List;

@RestController
@RequestMapping(path= "/pizzaorders")
public class PizzaOrderController {

    //to zamiast konstruktora, ale nie jest zalecany / wtedy pola nie mogą być final
    /*
    @Autowired
    private PizzaOrderService pizzaOrderService;
    @Autowired
    private PizzaOrderConverter pizzaOrderConverter;*/

    private final PizzaOrderService pizzaOrderService;
    private final PizzaOrderConverter pizzaOrderConverter;

    //to jest przykład dependency injection, czyli wstrzykiwania zależności;
    //o wstrzykiwaniu zależności mówimy wtedy, gdy w konstruktorze klasy przekazujemy pola będące innymi klasami
    //lub gdy obiekt tworzony jest poprzez wykorzystanie innych klas
    //DI jest formą Inversion of Control, czyli kontrola nad obiektem jest odwrócona i zależna nie tylko od danej klasy, ale też od innych klas
    @Autowired
    public PizzaOrderController(PizzaOrderService pizzaOrderService, PizzaOrderConverter pizzaOrderConverter){
        this.pizzaOrderService = pizzaOrderService;
        this.pizzaOrderConverter = pizzaOrderConverter;
    }

    @RequestMapping(path = "/") //w requestmapping domyślnie jest metoda GET
    public List<PizzaOrder> getAllOrders(){
        return pizzaOrderService.findAll();

    }

    @GetMapping(path = "/{id}")//to jest to samo co requestMapping z metodą GET
    public PizzaOrder getOrder(@PathVariable Long id){
        return pizzaOrderService.findById(id);
    }

    @PutMapping(path="/{id}/completed")
    public PizzaOrder completeOrder(@PathVariable Long id){
        return pizzaOrderService.completeOrder(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.POST) //jeśli chcemy inną metodę, trzeba dodać 'method'
    public PizzaOrder createOrder(@RequestBody PizzaOrderDTO pizzaOrderDTO){ //@requestBody oznacza, że to co jest w body jest zamieniane na obiekt
        PizzaOrder pizzaOrder = pizzaOrderConverter.convert(pizzaOrderDTO);
        return pizzaOrderService.create(pizzaOrder);
    }

    @GetMapping("/search")
    public List<PizzaOrder> searchPizzaOrders(@RequestParam boolean completed){
        return pizzaOrderService.searchPizzaOrders(completed);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        pizzaOrderService.deleteById(id);
    }
}
