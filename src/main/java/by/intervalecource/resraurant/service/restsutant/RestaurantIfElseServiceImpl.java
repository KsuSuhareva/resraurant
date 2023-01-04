package by.intervalecource.resraurant.service.restsutant;

import by.intervalecource.resraurant.model.Visitor;
import by.intervalecource.resraurant.service.kitchen.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class RestaurantIfElseServiceImpl implements RestaurantService {
    @Autowired
    private AsianKitchen asianKitchen;
    @Autowired
    private FastFood fastFood;
    @Autowired
    private MolecularKitchen molecularKitchen;
    @Autowired
    private SlavyanskayaKitchen slavyanskayaKitchen;
    @Autowired
    private DefaultStolovka stolovka;


    @Override
    public void feed(Visitor visitor) {
        if (visitor.getPreference().equals(Kitchen.ASIAN)) {
            asianKitchen.feed(visitor);
        } else if (visitor.getPreference().equals(Kitchen.FAST_FOOD)) {
            fastFood.feed(visitor);
        } else if (visitor.getPreference().equals(Kitchen.MOLECULAR)) {
            molecularKitchen.feed(visitor);
        } else if (visitor.getPreference().equals(Kitchen.SLAVYANSKAYA)) {
            slavyanskayaKitchen.feed(visitor);
        } else {
            System.out.println("Не могу определится!");
            stolovka.feed(visitor);
        }
    }
}
