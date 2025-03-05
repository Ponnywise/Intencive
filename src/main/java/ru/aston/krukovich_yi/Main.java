package ru.aston.krukovich_yi;


import ru.aston.krukovich_yi.task5.Task;

public class Main {
    public static void main(String[] args) {
        //Task.task1();
        //Task.task2();
        //Task.task3();
        //Task.task4();
        String input = "Hello, World! 123_@#";
        String result = input.replaceAll("[^a-zA-Z0-9а-яА-Я]", "\\$");
        System.out.println(result);

    }
}