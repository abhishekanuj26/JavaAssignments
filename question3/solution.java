package question3;

import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.isEmpty())
                break;
            list.add(input);
        }


        list.sort(Comparator.comparingInt(s -> s.charAt(0)));
        System.out.println(list);


        List<String> list1 = new ArrayList<>(list);
        getSortedListBasedOnIntegers(list1);
    }

    private static void getSortedListBasedOnIntegers(List<String> list1) {
        list1.sort((s1, s2) -> {
            int n1 = Integer.parseInt(s1.substring(1));
            int n2 = Integer.parseInt(s2.substring(1));
            return n2 - n1;
        });
        list1.sort(Comparator.comparingInt(s -> s.charAt(0)));
        System.out.println(list1);

    }
}
