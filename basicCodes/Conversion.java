public class Conversion{
  public static void main(String[] args) {
    String s1 =  "IshanJawade";
    String s2 =  "300";
    int num = 500;

    // String to => int
    int num1 = Integer.parseInt(s2);
    System.out.println("String to => int: " + num1);

    // String to char[]
    char ch[] = s1.toCharArray();
    System.out.print("String to => ch[]: ");
    for (char i:ch){
      System.out.print(i + ", ");
    }
    System.out.println();

    // int => String
    String s3 = Integer.toString(num);
    System.out.println("int to => String: " + s3);
  }
}