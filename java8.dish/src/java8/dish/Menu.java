package java8.dish;

import java.util.List;

public class Menu {
    private final List<Dish> dishes;

    public Menu(List<Dish> menu) {
        this.dishes = menu;
    }

    public List<Dish> Dishes() {
        return dishes;
    }

    @Override
    public String toString() {
        return "dishes{" +
                "dishes=" + dishes +
                '}';
    }
}
