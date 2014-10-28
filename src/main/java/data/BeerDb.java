package data;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.List;

public class BeerDb {
    public static List<Beer> list() {
        return Lists.newArrayList(
            new Beer("Bigfoot Barley Wine", "Sierra Nevada", BeerType.ALE, bd(5.5)),
            new Beer("Pilsner Urquell", "Plzensky Prazdroj’s", BeerType.LAGER, bd(6.5)),
            new Beer("Alaskan Smoked Porter", "Alaskan Brewing Co.’s Alaskan", BeerType.SPECIALITY, bd(4.3)),
            new Beer("St. Nick Bock", "Pennsylvania Brewing Co.", BeerType.LAGER, bd(4.5))

        );
    }

    private static BigDecimal bd(double decimal) {
        return new BigDecimal(decimal);
    }
}
