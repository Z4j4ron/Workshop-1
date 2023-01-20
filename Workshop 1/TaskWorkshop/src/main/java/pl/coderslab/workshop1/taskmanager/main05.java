package pl.coderslab.workshop1.taskmanager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class main05 {
    public static void main() {
        try {
            addTask();
            main02.disp();
            main04.selection();
        } catch (FileNotFoundException ex) {
            System.out.println("Cannot find file");
        }
    }
    public static void addTask() throws FileNotFoundException {
        File file = new File("tasks.csv");
        Path path = Paths.get("tasks.csv");
        StringBuilder newTask = new StringBuilder();
        Scanner consoleScanner = new Scanner(System.in);
        Scanner scan = new Scanner(file);
        System.out.println(ConsoleColors.BLUE_BRIGHT + "Please add task description:");
        newTask.append(consoleScanner.nextLine()).append(", ");

        System.out.println(ConsoleColors.BLUE_BRIGHT + "Please add task due date: YYYY-MM-DD:");
        newTask.append(consoleScanner.nextLine()).append(", ");

        System.out.println(ConsoleColors.BLUE_BRIGHT + "Is your task important: true/false:");
        newTask.append(consoleScanner.nextLine());

        StringBuilder taskSB = new StringBuilder();
        while (scan.hasNext()) {
            taskSB.append(scan.nextLine()).append(",");
        }
//        taskSB.append(newTask);
        String tasksString = newTask.toString();
//        String[] arr = tasksString.split(",");
        try {
            Files.writeString(path, "\n" + tasksString, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Data input error");
        }
    }
}
