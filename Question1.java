import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            int n = sc.nextInt();
            List<Integer> array1 = new ArrayList<>(n);
            List<Integer> array2 = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                array1.add(a);
            }

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                array2.add(a);
            }

            int result = minMax(array1, array2);
            System.out.println(result);
            t--;
        }

    }

    private static int minMax(List<Integer> array1, List<Integer> array2) {

        int max1 = Collections.max(array1);
        int max2 = Collections.max(array2);

        while(true){
            int i = array1.indexOf(max1);
            int j = array2.indexOf(max2);
            if(max1>max2){
                if(max2>array1.get(j)){
                    int temp = array2.get(j);
                    array2.set(j,array1.get(j));
                    array1.set(j,temp);
                    max2=Collections.max(array2);
                }
                else
                    break;
            }
            else{
                if(max1>array2.get(i)){
                    int temp = array1.get(i);
                    array1.set(i,array2.get(i));
                    array2.set(i,temp);
                    max1=Collections.max(array1);
                }
                else
                    break;
            }
        }


        return max2*max1;
    }

}

