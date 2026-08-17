import java.util.*;

public class insertion {
    public static void main(String[] args) {
        int arr[] = {4, 98, 0, 2, 5};

        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int t = arr[i];

            while (j >= 0 && arr[j] > t) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = t; // Fixed: changed arr[j] to arr[j + 1]
        }

        // Optional: print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}