package com.shoppinglist.shoppinglist.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("api/v1/shopping-list-items")
public class ShoppingListController {
    @GetMapping
    public List<String> get() {
        return List.of(
                "boter",
                "kaas",
                "scharreleieren",
                "sinaasappelsap"
        );
    }
}
