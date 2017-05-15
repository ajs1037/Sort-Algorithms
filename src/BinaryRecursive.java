import java.util.*;

public class BinaryRecursive {

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    System.out.println(brSort(1, arr, 0, arr.length - 1));
  }

  public static int brSort(int find, int[] arr, int start, int end) {
    int mid = start + (end - start) / 2;

    if (arr[mid] == find) {
      return mid;
    } 
    else if (find < arr[mid]) {
      return brSort(find, arr, start, mid);
    } 
    else if (find > arr[mid]) {
      return brSort(find, arr, mid, end);
    }

    return -1;
  }
}
