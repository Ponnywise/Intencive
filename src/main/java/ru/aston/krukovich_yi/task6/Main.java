package ru.aston.krukovich_yi.task6;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
//        List<String> things = readString(openFileDialog("Выберите файл"));
//        things.forEach(System.out::println);
//        System.out.println();

        //uniteStrings("c:\\things1.txt", "c:\\things2.txt");
//        uniteStrings(openFileDialog("Выберите исходник"), openFileDialog("Выберите добавляемый файл"));
//        things = readString("c:\\things1.txt");
//        things.forEach(System.out::println);
//        System.out.println();

        List<String> things = readString(openFileDialog("Выберите файл"));
        things.stream()
                .map(str -> replaceWith(str))

                .forEach(System.out::println);

    }

    public static List<String> readString(String filePath){
        List<String> result = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void writeString(String line, String filePath) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))){
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void uniteStrings(String source, String add) {
        List<String> forAdd = readString(add);
        forAdd.forEach(line -> writeString(line, source));
    }

    public static String replaceWith(String line) {
        return line.replaceAll("[^a-zA-Zа-яА-Я0-9]", "\\$");
    }

    public static String openFileDialog(String description){
        Frame frame = new Frame();
        frame.setVisible(false);
        FileDialog dialog = new FileDialog(frame, description);
        dialog.setVisible(true);
        String directory = dialog.getDirectory();
        String file = dialog.getFile();

        if (directory != null && file != null) {
            File selectedFile = new File(directory, file);
            frame.dispose();
            return selectedFile.getAbsolutePath();
        } else {
            return "";
        }



    }
}
