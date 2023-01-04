package by.intervalecource.resraurant.service.kitchen;

import by.intervalecource.resraurant.service.menu.Menu;
import org.springframework.stereotype.Component;

@Component
public class Sushi implements Menu {
    @Override
    public void get(){
        System.out.println("Может быть суши!");
    }
}

