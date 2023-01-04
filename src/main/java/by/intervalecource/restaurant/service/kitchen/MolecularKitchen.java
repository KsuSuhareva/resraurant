package by.intervalecource.restaurant.service.kitchen;


import by.intervalecource.restaurant.model.Visitor;
import by.intervalecource.restaurant.service.menu.CarrotAir;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MolecularKitchen implements Kitchen{
    private CarrotAir carrotAir;

    @Override
    public void feed(Visitor visitor) {
        System.out.println("Молекулярная кухня! Неверь глазам своим!");
        carrotAir.get();
    }

    @Override
    public String myType() {
        return "molecular";
    }
}
