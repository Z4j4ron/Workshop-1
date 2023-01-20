package pl.coderslab.workshop1.taskmanager;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;

public class main06 {
    public static void removeTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(ConsoleColors.BLUE + "Select task number to remove: ");
        String r = scanner.nextLine();
        String[][] tasArr = main03.tasks;
        for (int i = 0; i < tasArr.length; i++) {
            for (int j = 0; j < tasArr[i].length; j++) {
                if (r.equals(tasArr[i])) {
                    ArrayUtils.remove(main03.tasks, i);
                }
            }
        }
        main02.disp();
        main04.selection();
    }
}
