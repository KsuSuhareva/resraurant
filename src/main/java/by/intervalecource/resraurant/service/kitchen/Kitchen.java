package by.intervalecource.resraurant.service.kitchen;

import by.intervalecource.resraurant.model.Visitor;

public interface Kitchen {
    void feed(Visitor visitor);

    String myType();

    String ASIAN = "asian";
    String FAST_FOOD = "fast food";
    String MOLECULAR = "molecular";
    String SLAVYANSKAYA = "slavyanskaya";

}
