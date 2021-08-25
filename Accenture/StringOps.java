// Contains reversing of string
public class StringOps {
    public static void main(String[] args) {
        String str1 = "Hi I am Ishan Jawade.";
        StringBuilder sb = new StringBuilder(str1);  // Convg String => String Builder
        sb.reverse();   // reverse the string
        String str1Rev = sb.toString();              // Convg String Builder => String
        System.out.println(sb);
        System.out.println(str1Rev);
        System.out.println(str1.substring(0,7));     //Cropping the string 
        System.out.println(str1.toLowerCase());      //Lowercase
        System.out.println(str1.toUpperCase());      //Uppercase
        System.out.println(str1.length());          // length of string 
    }
}
