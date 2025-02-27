package ru.aston.krukovich_yi.task2;

import java.util.Arrays;
import java.util.List;
//Умножить каждое число в массиве [1, 2, 3, 4, 5] на 2
public class Task2 {

    public static void task(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

    }
}
