package geeksForGeeks.arrays;

/**
 * @author Sarveswara Tippireddy
 *     <p>This GeeksforGeeks problem can be found @
 *     http://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 */
public class Arrays031 {
  public void sort(int[] input) {
    int low = 0, mid = 0, high = input.length - 1;
    while (mid <= high) {
      if (input[mid] == 1) {
        mid++;
      } else if (input[mid] == 0) {
        input[mid] = 1;
        input[low] = 0;
        low++;
        mid++;
      } else {
        input[mid] = input[high];
        input[high] = 2;
        high--;
      }
    }
  }
}