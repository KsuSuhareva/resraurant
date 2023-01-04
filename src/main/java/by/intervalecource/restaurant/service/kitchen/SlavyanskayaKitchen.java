package by.intervalecource.restaurant.service.kitchen;

import by.intervalecource.restaurant.model.Visitor;
import by.intervalecource.restaurant.service.menu.Borsch;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SlavyanskayaKitchen implements Kitchen{
    private Borsch borsch;

    @Override
    public void feed(Visitor visitor) {
        System.out.println("Славянская кухня! Аппетит приходит во время еды!");
        borsch.get();
    }

    @Override
    public String myType() {
        return "slavyanskaya";
    }
}
