package com.gbsplus.service;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileStreamDemo {


    static void writeDataIntoFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("order", true))) {
            writer.println("Item Quantity Price Total");
            writer.println("Soap 1 1.50 2.00");
            writer.println("Soap 2 1.50 2.00");
            writer.println("Soap 3 1.50 2.00");
            writer.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void readFromFile() {

        try (Stream<String> lines = Files.lines(Path.of("order"))) {
            lines
                .skip(1)
                .forEach(action -> System.out.println(action));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFromFile();
    }

}
