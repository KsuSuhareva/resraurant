package by.intervalecource.resraurant.service.restsutant;

import by.intervalecource.resraurant.model.Visitor;
import by.intervalecource.resraurant.service.kitchen.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class RestaurantSwitchServiceImpl implements RestaurantService {
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
        switch (visitor.getPreference()) {
            case Kitchen.ASIAN:
                asianKitchen.feed(visitor);
                break;
            case Kitchen.FAST_FOOD:
                fastFood.feed(visitor);
                break;
            case Kitchen.MOLECULAR:
                molecularKitchen.feed(visitor);
                break;
            case Kitchen.SLAVYANSKAYA:
                slavyanskayaKitchen.feed(visitor);
                break;
            default:
                System.out.println("Не могу определится!");
                stolovka.feed(visitor);
                break;
        }
    }
}