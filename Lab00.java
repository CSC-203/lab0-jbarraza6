public class Lab00
{
   static int add(int x, int y) {
      return x + y;
   }
   public static void main(String[] args) {
      // Part 1
      int x = 5;
      String y = "hello";
      double z = 9.8;
      System.out.println("x: " + x + " y: " + y + " z:" + z);

      // Part 2
      int[] array1 = {1, 2, 3, 4};
      for (int num : array1) {
         System.out.println(num);
      }
      // Part 3
      int sum = add(6, 42);
      System.out.println(sum);

      // Part 4
      String text = "John 3:16 - For God so loved the world that He " +
              "gave His one and only son that whoever believes in Him " +
              "shall not perish but have eternal life";
      int charCount = 0;
      for (int i = 0; i < text.length(); i++) {
         charCount++;
      }
      System.out.println("Total characters in the string: " + charCount);

      // Part 5
      int num = 6;
      double point = 3.4;
      byte bite = 3;
      short shirt = 1;
      long lungs = 73;
      boolean TrueFalse = true;
      char charizard = 'c';
      String word = "string";




   }
}