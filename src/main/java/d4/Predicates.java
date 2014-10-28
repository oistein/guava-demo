package d4;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import data.Beer;
import data.BeerDb;

import java.math.BigDecimal;

public class Predicates {
    public static void main(String[] args) {
        // Filtrering
        Iterables.filter(BeerDb.list(), new Predicate<Beer>() {
            @Override
            public boolean apply(Beer input) {
                return input.getAbv().compareTo(new BigDecimal(6.4)) > 0;
            }
        }); // "Pilsner Urquell"


        // Søk
        Iterables.find(BeerDb.list(), filter());

    }

    private static Predicate<Beer> filter() {
        return new Predicate<Beer>() {
            @Override
            public boolean apply(Beer input) {
                return false;
            }
        };
    }
}
