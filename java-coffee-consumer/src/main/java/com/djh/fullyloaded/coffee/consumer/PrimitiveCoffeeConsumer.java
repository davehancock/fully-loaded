package com.djh.fullyloaded.coffee.consumer;

import com.djh.fullyloaded.coffee.domain.Caffeine;
import com.djh.fullyloaded.coffee.domain.CoffeeBean;
import org.springframework.stereotype.Service;

/**
 * A primitive implementation of a coffee consumer. Simply takes the bean regardless of variety
 * and roastedness and extracts a consistent 5% caffeine output.
 * <p>
 * The output is measured in whole milligrams and is always rounded down.
 *
 * @author David Hancock
 */
@Service
public class PrimitiveCoffeeConsumer implements CoffeeConsumer {

    @Override
    public Caffeine consumeCoffeeBean(CoffeeBean coffeeBean) {

        double coffeeBeanWeight = coffeeBean.getWeight();

        if (coffeeBeanWeight < 0.0) {
            throw new IllegalArgumentException("Coffee Beans can't weigh less than nothing!");
        } else {
            int dosage = (int) (coffeeBeanWeight * 0.05);
            return new Caffeine(dosage);
        }
    }

}
