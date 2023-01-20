package pl.coderslab.workshop1.taskmanager;

public class main02 {

    public static void disp() {
        System.out.println(ConsoleColors.BLUE + "Please select an option:");
        String[] options = {"add", "remove", "list", "exit"};
        for (String option : options) {
            System.out.println(ConsoleColors.RESET + option);
        }
    }
}
