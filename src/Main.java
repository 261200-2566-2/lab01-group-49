import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter nonnegative integer : ");
        int n = Integer.parseInt(s.nextLine());

        int [] numbers = new int [n];
        for (int i = 0; i < n; i++){
            System.out.print("Input integer " + (i+1) +" : ");
            numbers[i] = s.nextInt();
        }

        sortArray a = new sortArray(numbers);
        a.sort();
        int [] sortedInt = a.getSorted();

        for (int i = 0; i < n; i++){
            System.out.println(sortedInt[i]);
        }
    }
}