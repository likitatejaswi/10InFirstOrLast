import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int lengthOfArray = scanner.nextInt();

        System.out.println("Enter the elements in the array");
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            array[i] = (scanner.nextInt());
        }
        Ex74 ex = new Ex74();
        boolean result = ex.count(array);
        System.out.println("Final result :"+result);

    }


}
