package pl.coderslab.workshop1.taskmanager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main03 {
        static String[][] tasks;
        static int lines;

        public static void taskList() {
            File file = new File("tasks.csv");
            try(Scanner scan = new Scanner(file)) {
                StringBuilder taskSB = new StringBuilder();
                lines = 0;
                while (scan.hasNext()) {
                    taskSB.append(lines).append(" : ").append(scan.nextLine()).append(",");
                    lines++;
                }
                String tasksString = taskSB.toString();
                String[] arr = tasksString.split(",");
                tasks = new String[lines][arr.length];
                for (int i = 0; i < 1; i++) {
                    for (int j = 0; j < tasks[i].length; j++) {
                        tasks[i][j] = arr[j];
                        System.out.println(tasks[i][j]);
                    }
                }
            }catch (FileNotFoundException e) {
                System.out.println("File has not been found");
            }
            main02.disp();
            main04.selection();
        }

}

