package com.djh.fullyloaded.coffee.consumer;

import com.djh.fullyloaded.coffee.domain.Caffeine;
import com.djh.fullyloaded.coffee.domain.CoffeeBean;

/**
 * A Coffee consumer takes in CoffeeBeans on at a time and produces a corresponding Caffeine output
 *
 * @author David Hancock
 */
public interface CoffeeConsumer {

    Caffeine consumeCoffeeBean(CoffeeBean coffeeBean);

}
