
// Java program to demonstrate working of Scanner in Java
import java.util.Arrays;
import java.util.Scanner;
 
// we are making the assumption that the user knows the
// correct input for the strings:
//    - uses : to separate minutes and hours
//    - does not exceed 4 digits
//    - does not add leading zeros to hours
class ArithmeticSeqFinder {
  public static void main(String args[]) {
    try (Scanner in = new Scanner(System.in)) {
        System.out.print("Please input the time: ");
        String time = in.nextLine();

        String numSeq = time.replace(":", "");
        System.out.println("You entered string " + numSeq);

        char[] x = numSeq.toCharArray();
        System.out.println(Arrays.toString(x));
    }
  }
  
  // inSortedTime(numSeq) checks if the time is sorted
  // since arithmetic sequences only found in sorted arrays
  // Case 1: Increasing: 1345, 1239, 4678 (TRUE)
  // Case 2: Decreasing: 9874, 7543, 8622 (TRUE)
  // Case 3: Constant: 2222, 8888, 1111 (TRUE)
  // Returns FALSE in all other cases: 2391, 4526, 0010 
  public static void isSortedTime(int numSeq) {
    
  }
}