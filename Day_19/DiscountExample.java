// procedural / imperative programming vs declarative programming

import java.util.Arrays;
import java.util.List;
import java.math.BigDecimal;

public class DiscountExample {

    public static void main(String[] args) {

        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("20"),
                new BigDecimal("17"), new BigDecimal("30"),
                new BigDecimal("15"), new BigDecimal("35")
        );

        // total prices greater than EUR 20 discount by 10%

//        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;
//
//        for(BigDecimal price : prices) {
//
//            if (price.compareTo(BigDecimal.valueOf(20)) > 0) {
//
//                totalOfDiscountedPrices =
//                        totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
//
//            }
//
//        }

        // this can be run parralell on different cores...
        // procedural / imperative programming vs declarative programming

        final BigDecimal totalOfDiscountedPrices =
                prices.stream()
                      .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                      .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                      .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total: " + totalOfDiscountedPrices);

    }

}