package by.intervalecource.restaurant.service.restaurant;

import by.intervalecource.restaurant.model.Visitor;
import by.intervalecource.restaurant.service.kitchen.DefaultStolovka;
import by.intervalecource.restaurant.service.kitchen.Kitchen;
import by.intervalecource.restaurant.service.menu.Porridge;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class  RestaurantMapServiceImpl implements RestaurantService {

    Map<String, Kitchen> kitchenMap;

    public RestaurantMapServiceImpl(List<Kitchen> kitchens) {
        kitchenMap = kitchens.stream().collect(Collectors.toMap(Kitchen::myType, Function.identity()));
    }

    @Override
    public void feed(Visitor visitor) {
        Kitchen kitchen = kitchenMap.getOrDefault(visitor.getPreference(), new DefaultStolovka(new Porridge()));
        if (kitchen instanceof DefaultStolovka){
            System.out.println("Не могу определится!");
        }
        kitchen.feed(visitor);
    }
}
