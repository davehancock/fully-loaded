package com.djh.fullyloaded.coffee.consumer;

import com.djh.fullyloaded.coffee.domain.Caffeine;
import com.djh.fullyloaded.coffee.domain.CoffeeBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author David Hancock
 */
@RestController
@RequestMapping
public class CoffeeController {

    private CoffeeConsumer coffeeConsumer;

    public CoffeeController(CoffeeConsumer coffeeConsumer) {
        this.coffeeConsumer = coffeeConsumer;
    }

    @PostMapping
    public Caffeine addCoffeeBean(@RequestBody CoffeeBean coffeeBean) {
        return coffeeConsumer.consumeCoffeeBean(coffeeBean);
    }

}
