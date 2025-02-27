package ru.aston.krukovich_yi.task1;

//import java.util.stream.IntStream;
import java.util.stream.Stream;
//Вывести все четные числа в диапазоне от 1 до 100
public class Task1 {

//    public static void task1() {
//        IntStream.range(1, 100)
//                .filter(n -> n % 2 == 0)
//                .forEach(System.out::println);
//
//    }

    public static void task() {
        Stream.iterate(1, n -> n+1)
                .limit(100)
                .filter(n -> n % 2 ==0)
                .forEach(System.out::println);

    }
}
