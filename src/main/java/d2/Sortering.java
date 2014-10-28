package d2;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import data.Beer;
import data.BeerDb;
import data.BeerType;

public class Sortering {
    public static void main(String[] args) {
        Ordering<Beer> byAlcoholLevel = new Ordering<Beer>() {
            public int compare(Beer left, Beer right) {
                return left.getAbv().compareTo(right.getAbv());
            }
        };

        byAlcoholLevel.min(BeerDb.list()); // minste element
        byAlcoholLevel.max(BeerDb.list()); // største element
        byAlcoholLevel.sortedCopy(BeerDb.list()); // ny sortert liste
        byAlcoholLevel.immutableSortedCopy(BeerDb.list()); // immutable
        byAlcoholLevel.reverse().sortedCopy(BeerDb.list()); // reversert kopi


        // eksplisitt sortering
        Ordering<Beer> byLagerAleOrdering = Ordering.explicit(BeerType.LAGER, BeerType.ALE)
                .onResultOf(new Function<Beer, BeerType>() {
                                @Override
                                public BeerType apply(Beer beer) {
                                    return beer.getBeerType();
                                }
                            });




    }

}
