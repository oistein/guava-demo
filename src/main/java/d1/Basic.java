package d1;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Iterables;
import data.Beer;
import data.BeerDb;

import java.math.BigDecimal;


public class Basic {

    public static void main(String[] args) {

        // Nullsafe equals
        Objects.equal(1, null);

        // Var-args hashcode
        Objects.hashCode(1, "foo", new BigDecimal(2.0));

        // compareTo
        final Beer beer = Iterables.getFirst(BeerDb.list(), null);
        new Comparable<Beer>() {
            @Override
            public int compareTo(Beer that) {
                return ComparisonChain.start()
                        .compare(beer.getAbv(), that.getAbv())
                        .compare(beer.getName(), that.getName())
                        .result();
            }
        };


        // Optional null-safe . std java 8
        Optional<Long> val = Optional.of(1L);
        val.isPresent(); // true
        val.get(); // 1L
        // billion dollar mistake
    }
}
