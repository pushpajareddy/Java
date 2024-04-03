import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

 class SortNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the names (type 'done' when finished):");
        List<String> names = new ArrayList<>();
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("done")) {
            names.add(input);
        }

        System.out.println("Order (A/D):");
        String order = scanner.nextLine().toUpperCase();
        Collections.sort(names);
        if (order.equals("D")) {
            Collections.reverse(names);
        }

        System.out.println("Sorted names:");
        for (String name : names) 
        {
            System.out.println(name);
        }
    }
}


