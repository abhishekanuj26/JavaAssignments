package question5;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Boolean result = isPerfect(a);
        System.out.println(result);
    }

    private static Boolean isPerfect(int a) {
        int sum = 1;

        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                if (i * i != a)
                    sum += i + (a / i);
                else
                    sum += i;
            }
        }

        return sum == a && a != 1;

    }

}
