package by.intervalecource.resraurant.service.kitchen;

import by.intervalecource.resraurant.model.Visitor;
import by.intervalecource.resraurant.service.menu.Porridge;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DefaultStolovka implements Kitchen{
    private Porridge porridge;

    @Override
    public void feed(Visitor visitor) {
        System.out.println("Могу предложить Столовка! Щи да каша - пища наша!");
        porridge.get();
    }

    @Override
    public String myType() {
        return "default";
    }
}
