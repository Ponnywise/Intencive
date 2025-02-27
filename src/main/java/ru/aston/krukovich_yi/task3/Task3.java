package ru.aston.krukovich_yi.task3;

import java.util.stream.Stream;
//Создать стрим чисел от 0 до 100. Умножить их на 2 и вывести на экран результат, ограничиться первыми 10 результатами
public class Task3 {

    public static void task(){
        Stream.iterate(0, n -> n+1)
                .limit(100)
                .map(n -> n * 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
