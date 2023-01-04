package by.intervalecource.resraurant.service.kitchen;

import by.intervalecource.resraurant.model.Visitor;
import by.intervalecource.resraurant.service.menu.Burger;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FastFood implements Kitchen{
    private Burger burger;

    @Override
    public void feed(Visitor visitor) {
        System.out.println("FastFood! Ешь быстро, умри молодым!'");
        burger.get();
    }

    @Override
    public String myType() {
        return "fast food";
    }
}
