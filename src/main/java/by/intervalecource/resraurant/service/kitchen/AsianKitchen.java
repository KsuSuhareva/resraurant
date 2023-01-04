package by.intervalecource.resraurant.service.kitchen;

import by.intervalecource.resraurant.model.Visitor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AsianKitchen implements Kitchen{
    private Sushi sushi;

    @Override
    public void feed(Visitor visitor) {
        System.out.println("Азиатская кухня! Нет ничего несъедобного, есть плохие повара!");
        sushi.get();
    }

    @Override
    public String myType() {
        return "asian";
    }
}