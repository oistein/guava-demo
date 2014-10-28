package d3;

import com.google.common.base.Function;
import com.google.common.collect.*;
import data.Beer;
import data.BeerDb;
import data.BeerType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
        // transformering
        List<String> beerNames = Lists.transform(BeerDb.list(), new Function<Beer, String>() {
            @Override
            public String apply(Beer beer) {
                return beer.getName();
            }
        });


        // list til map
        Map<BeerType, List<Beer>> beertypeMap = new HashMap<BeerType, List<Beer>>();
        for (Beer beer : BeerDb.list()) {
            List<Beer> beers = beertypeMap.get(beer.getBeerType()); // <- denne linjen inneholder key
            if (beers == null) {
                beers = new ArrayList<Beer>();
                beertypeMap.put(beer.getBeerType(), beers);// <- denne linjen inneholder key
            }
            beers.add(beer);
        }

        // guava
        Multimap<BeerType, Beer> beertypeMapG = Multimaps.index(BeerDb.list(), new Function<Beer, BeerType>() {
            @Override
            public BeerType apply(Beer beer) {
                return beer.getBeerType();
            }
        });


        // BiMaps
        ImmutableBiMap<String, Integer> mapping = ImmutableBiMap.of("2", 2,
                                                               "3", 3);

        mapping.inverse().get(2); // "2"
        mapping.get("3"); // 3


        // Immutable collections
        ImmutableList.of(1); // 1
        ImmutableSet.of("foo"); // "foo"
    }

}
