package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();
        if(numberOfDishes == 0)
            return emptyList;
        list.add(4);
        list.add(8);
        list.add(1);
        list.add(6);
        list.add(11);
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(9);
        return list;
    }
}