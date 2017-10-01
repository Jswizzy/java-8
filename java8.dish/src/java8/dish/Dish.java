package java8.dish;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String Name() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int Calories() {
        return calories;
    }

    public Type Type() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }

    public enum Type { MEAT, FISH, OTHER }
}
