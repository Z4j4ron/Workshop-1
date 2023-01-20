package pl.coderslab.workshop1.taskmanager;

import java.util.Scanner;

public class main04 {
    public static void main(String[] args) {

    }
    public static void selection() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        switch (input) {
            case "add":
                main05.main();
                break;
            case "remove":
                main06.removeTask();
                break;
            case "list":
                main03.taskList();
                break;
//            case "exit":
//
            default:
                System.out.println("Please select a correct option.");
        }
    }
}
