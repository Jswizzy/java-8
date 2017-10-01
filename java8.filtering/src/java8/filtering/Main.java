package java8.filtering;

import java8.dish.Dish;
import java8.dish.Dishes;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String... args) {

        List<Dish> dishes = new Dishes().Menu().Dishes();

        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        List<String> lowCaloricDishesName =
                dishes.stream()
                        .filter(d -> d.Calories() < 400)
                        .sorted(Comparator.comparingInt(Dish::Calories))
                        .map(Dish::Name)
                        .collect(toList());

        lowCaloricDishesName.forEach(System.out::println);

        List<String> threeHighCaloricDishNames =
                dishes.stream()
                        .filter(d -> d.Calories() > 300)
                        .map(Dish::Name)
                        .limit(3)
                        .collect(toList());

        threeHighCaloricDishNames.forEach(System.out::println);

    }
}
