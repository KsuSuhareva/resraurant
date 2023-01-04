package by.intervalecource.resraurant.service.restaurant;

import by.intervalecource.resraurant.model.Visitor;
import by.intervalecource.resraurant.service.kitchen.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
public class RestaurantSwitchServiceImpl implements RestaurantService {

    private final AsianKitchen asianKitchen;
    private final FastFood fastFood;
    private final MolecularKitchen molecularKitchen;
    private final SlavyanskayaKitchen slavyanskayaKitchen;
    private final DefaultStolovka stolovka;

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