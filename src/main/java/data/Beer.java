package data;

import java.math.BigDecimal;

public class Beer {
    private BigDecimal abv;
    private String manufacturer;
    private String name;
    private BeerType beerType;

    public Beer(String name, String manufacturer, BeerType beerType, BigDecimal abv) {
        this.abv = abv;
        this.manufacturer = manufacturer;
        this.name = name;
        this.beerType = beerType;
    }

    public BigDecimal getAbv() {
        return abv;
    }

    public String getName() {
        return name;
    }

    public BeerType getBeerType() {
        return beerType;
    }
}
