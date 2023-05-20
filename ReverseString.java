import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to be reversed");
        String str = sc.nextLine();
        System.out.println(rev(str));
    }
    public static String rev(String str)

    {
        char ch;
        String reverse="";
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            reverse=ch+reverse;
        }
        return reverse;
    }

}