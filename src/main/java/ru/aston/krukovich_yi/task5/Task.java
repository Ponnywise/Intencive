package ru.aston.krukovich_yi.task5;

//import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Task {
//    public static void task1() {
//        IntStream.range(1, 100)
//                .filter(n -> n % 2 == 0)
//                .forEach(System.out::println);
//
//    }
    /**Вывести все четные числа в диапазоне от 1 до 100
     *
     */
    public static void task1() {
        Stream.iterate(1, n -> n+1)
                .limit(100)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }

    /**
     *Умножить каждое число в массиве [1, 2, 3, 4, 5] на 2
     */

    public static void task2(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

        }

    /**Создать стрим чисел от 0 до 100. Умножить их на 2 и вывести на экран результат, ограничиться первыми 10 результатами
     *
     */

    public static void task3(){
        Stream.iterate(0, n -> n+1)
                .limit(100)
                .map(n -> n * 2)
                .limit(10)
                .forEach(System.out::println);
        }

    /**
     * Соберите все элементы Stream в одну строку через пробел и выведите результат.
     */
    public static void task4(){
        List<String>  words = Arrays.asList(
                "дом", "солнце", "книга", "река", "город",
                "цветок", "друг", "счастье", "радость", "ветер",
                "море", "лес", "птица", "звезда", "дорога",
                "окно", "письмо", "музыка", "время", "мечта");
        String result = words.stream()
                        .reduce("",(buf, str) -> buf + " " + str );
        System.out.println(result);
    }

    /**
     *
     */



}

