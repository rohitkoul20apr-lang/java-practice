import java.util.Arrays;
import java.util.Scanner;

public class Test {
    static boolean isAnagram(String a, String b) {

       char [] c=a.toCharArray();
       char [] d=b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        if(Arrays.equals(c,d))
       {
          return true;

       }
        return  false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
