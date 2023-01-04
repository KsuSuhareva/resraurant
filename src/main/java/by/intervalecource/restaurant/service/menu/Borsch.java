package by.intervalecource.restaurant.service.menu;

import org.springframework.stereotype.Component;

@Component
public class Borsch implements Menu{
    @Override
    public void get() {
        System.out.println("Может быть борщ!");
    }
}

