
// Java program to demonstrate working of Scanner in Java
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
 
// we are making the assumption that the user knows the
// correct input for the strings:
//    - uses : to separate minutes and hours
//    - does not exceed 4 digits
//    - does not add leading zeros to hours
//    - the time is valid (0 <= mins <= 60, 0 <= hrs <= 12)
class ArithmeticSeqFinder {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    
    int input = 0;
    int hours = 12; // denotes 12
    int minutes = 0;

    do {
      System.out.print("Please input the time: ");
      input = in.nextInt();
      hours = input / 60;
      if (hours % 12 == 0)
        hours = 12;
      else
        hours = hours % 12;
      minutes = input % 60;
      System.out.printf("%d:%02d", hours, minutes);
      System.out.println();
    } 
    while (true);
    
  }
  
  // inSortedTime(numSeq) checks if the time is sorted
  // since arithmetic sequences only found in sorted arrays
  // Case 1: Increasing: 1345, 1239, 4678 (TRUE)
  // Case 2: Decreasing: 9874, 7543, 8622 (TRUE)
  // Case 3: Constant: 2222, 8888, 1111 (TRUE)
  // Returns FALSE in all other cases: 2391, 4526, 0010 
  public static boolean isSortedTime(int[] numSeq) {
    if (IntStream.range(0, numSeq.length - 1).noneMatch(i -> numSeq[i] >= numSeq[i + 1]) ||
    IntStream.range(0, numSeq.length - 1).noneMatch(i -> numSeq[i] <= numSeq[i + 1])){
      return true;
    }
    else
      return false; 
  }
}