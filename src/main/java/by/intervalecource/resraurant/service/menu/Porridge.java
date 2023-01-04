package by.intervalecource.resraurant.service.menu;

import org.springframework.stereotype.Component;

@Component
public class Porridge implements Menu{
    @Override
    public void get() {
        System.out.println("Может быть каша!");
    }
}