import java.awt.font.NumericShaper.Range;

public class Lab00
{
   //file description
   public static void main(String[] args)
   {
      //declaring and initializing some variables
      int x = 5;
      String y = "hello";
      double z = 9.8;

      //printing the variables
      System.out.println("x:" + x + " y:" + y + " z:" + z);

      //a list (make an array in java)
      int[] nums = {3, 6, -1, 2};
      for (int num : nums) {
         System.out.println(num);
      }

      //call a function
      int numfound = char_count(y, 'l');
      System.out.println("Found:" + numfound);

      //a counting for a loop
      for (int i = 1 ; i < 11; i++) {
         System.out.print(i + " ");
      }
      System.out.println();
   
   }
   public static int char_count(String s, char c) {
      int count = 0;
      char[] string_items = s.toCharArray();
      for (int ch = 0; ch < s.length(); ch ++) {
         if (s.charAt(ch) == c) {
            count ++;
         }
      }
      return count;
   }
}