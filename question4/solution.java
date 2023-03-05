package question4;

import java.util.Scanner;

public class solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] startPoint = new int[2];
        startPoint[0] = scanner.nextInt();
        startPoint[1] = scanner.nextInt();
        String inputString = scanner.next();

        int[] endPoint = calculateEndPoint(startPoint, inputString);

        double distance = calculateDistance(startPoint, endPoint);

        System.out.println(distance);
    }

    private static int[] calculateEndPoint(int[] startPoint, String inputString) {
        int x = startPoint[0];
        int y = startPoint[1];

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            switch (c) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x++;
                case 'W' -> x--;
            }
        }

        return new int[]{x, y};
    }

    private static double calculateDistance(int[] startPoint, int[] endPoint) {
        int dx = endPoint[0] - startPoint[0];
        int dy = endPoint[1] - startPoint[1];

        return Math.sqrt(dx * dx + dy * dy);
    }
}



