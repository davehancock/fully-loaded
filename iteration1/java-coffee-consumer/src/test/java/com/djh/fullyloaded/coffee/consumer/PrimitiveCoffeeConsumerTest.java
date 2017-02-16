package com.djh.fullyloaded.coffee.consumer;

import com.djh.fullyloaded.coffee.domain.Caffeine;
import com.djh.fullyloaded.coffee.domain.CoffeeBean;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author David Hancock
 */
public class PrimitiveCoffeeConsumerTest {

    private static final String ARBITRARY_VARIETY = "Arabica";

    private CoffeeConsumer coffeeConsumer = new PrimitiveCoffeeConsumer();

    @Test
    public void consumeCoffeeBean_whenTypical() {

        CoffeeBean coffeeBean = new CoffeeBean(ARBITRARY_VARIETY, false, 160);

        Caffeine caffeine = coffeeConsumer.consumeCoffeeBean(coffeeBean);

        Assert.assertEquals(8, caffeine.getDosage());
    }

    @Test
    public void consumeCoffeeBean_whenTypicalRoundDown() {

        CoffeeBean coffeeBean = new CoffeeBean(ARBITRARY_VARIETY, true, 150);

        Caffeine caffeine = coffeeConsumer.consumeCoffeeBean(coffeeBean);

        Assert.assertEquals(7, caffeine.getDosage());
    }

    @Test
    public void consumeCoffeeBean_whenLowWeight() {

        CoffeeBean coffeeBean = new CoffeeBean(ARBITRARY_VARIETY, false, 16);

        Caffeine caffeine = coffeeConsumer.consumeCoffeeBean(coffeeBean);

        Assert.assertEquals(0, caffeine.getDosage());
    }

    @Test(expected = IllegalArgumentException.class)
    public void consumeCoffeeBean_whenNegative() {

        CoffeeBean coffeeBean = new CoffeeBean(ARBITRARY_VARIETY, false, -10);

        coffeeConsumer.consumeCoffeeBean(coffeeBean);
    }

}
