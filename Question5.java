import java.util.Scanner;
import java.util.ArrayList; 

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    ArrayList<Integer> enteredNumbers = new ArrayList<Integer>();
    for (int i = number; i < 0; i--) {
      int numberEntered = in.nextInt();
      enteredNumbers.add(numberEntered);
    }
    for (int i = 0; i < enteredNumbers.size(), i++){
      int mode = 0;
      int maxCount = 0;
      int currentNumber = enteredNumbers.get(i);
      for (int x = 0; x < enteredNumbers.size(), x++){
        int count = 0;
        if (currentNumber == enteredNumbers.get(x)){
          count += 1;
        }
      }
      if (count > maxCount){
        maxCount = count;
        mode = currentNumber;
      }
    }
  }
}
