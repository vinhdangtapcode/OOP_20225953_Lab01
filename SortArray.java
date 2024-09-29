import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);

        for (int j=0;j<n;j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("\nSum: "+sum);
        System.out.println("Average: "+((double)sum/n));
        input.close(); 
    }

}
