package com.example.graphql.controller;

import com.example.graphql.model.Item;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ItemController {

    @QueryMapping
    public List<Item> items() {
        return List.of(
                new Item("Notebook", "A paper notebook"),
                new Item("Pen", "A blue ink pen"),
                new Item("Eraser", "A small white eraser")
        );
    }

    @QueryMapping
    public List<Item> items2() {
        return List.of(
                new Item("Notebook2", "A paper notebook"),
                new Item("Pen2", "A blue ink pen"),
                new Item("Eraser2", "A small white eraser")
        );
    }
}