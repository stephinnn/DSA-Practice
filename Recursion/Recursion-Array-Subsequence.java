
// You are using Java
import java.util.*;

class Main {

    // Recursive function to print from a to n
    public static void sub(int a, int[] arr, List<Integer> temp) {
        if (a == arr.length) {
            System.out.println(temp);
            return;
        }
        temp.add(arr[a]);
        sub(a + 1, arr, temp);
        temp.remove(temp.size() - 1);
        sub(a + 1, arr, temp);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<Integer> ar = new ArrayList<>();

        sub(0, arr, ar);
    }
}