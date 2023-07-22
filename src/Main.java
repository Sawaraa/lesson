public class Main {

  public static void main(String[] args) {

    byte b = 2;
    int i = 1;
    long l = 10l;
    float f = 12.5F;
    double d = 13.3;
    short sh = 500;
    char c = 'a';
    boolean bl = true;
    String s = "string";

    System.out.println("Byte = "+ Byte.MAX_VALUE + " " +  Byte.MIN_VALUE);
    System.out.println("Integer = " + Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
    System.out.println("Long = " + Long.MAX_VALUE + " " + Long.MIN_VALUE);
    System.out.println("Float = " + Float.MAX_VALUE + " " + Float.MIN_VALUE);
    System.out.println("Short = " + Short.MAX_VALUE + " " +  Short.MIN_VALUE);
    System.out.println("Character = " + (int) Character.MAX_VALUE + " " + (int) Character.MIN_VALUE);
    System.out.println("Double = " + Double.MAX_VALUE + " " + Double.MIN_VALUE);

    int array[] = {9,10,50,5,100, 17,4,190,2,20};

    int Max = 0;
    int Min = array[0];

    for(int m = 0; m < array.length; m++ )
    {
      if (array[m] > Max) {
        Max = array[m];
      }

      if (array[m] < Min) {
        Min = array[m];
      }
    }
    System.out.println(Max + "\n"+ Min);
  }
}