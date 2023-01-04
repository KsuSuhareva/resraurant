package by.intervalecource.resraurant.service.restaurant;

import by.intervalecource.resraurant.model.Visitor;
import by.intervalecource.resraurant.service.kitchen.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor
public class RestaurantIfElseServiceImpl implements RestaurantService {
    private final AsianKitchen asianKitchen;
    private final FastFood fastFood;
    private final MolecularKitchen molecularKitchen;
    private final SlavyanskayaKitchen slavyanskayaKitchen;
    private final DefaultStolovka stolovka;


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
