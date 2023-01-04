package by.intervalecource.resraurant.controllers;

import by.intervalecource.resraurant.model.Visitor;
import by.intervalecource.resraurant.service.restsutant.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/restaurant/")
public class RestaurantController {
    private RestaurantService service;

    @PostMapping("feed")
    public Visitor feed(@RequestBody Visitor visitor) {
        System.out.println("Что предпочитаете, " + visitor.getName() + " ?");
        service.feed(visitor);
        return visitor;
    }

}

