package by.intervalecource.resraurant.service.menu;

import org.springframework.stereotype.Component;

@Component
public class Burger implements Menu{
    @Override
    public void get() {
        System.out.println("Может быть бургер!");
    }
}
