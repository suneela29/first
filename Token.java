import java.io.*;
import java.util.*;

public class Token {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int itr,x;
        String s = scan.nextLine().trim();
         scan.close();
        // Write your code here.
        String delims = "[ .,_'?!@]+";
        String[] str=s.split(delims);
        x=str.length;
        System.out.println(x);
        for(itr=0;itr<str.length;itr++)
        {
            System.out.println(str[itr]);
        }
        
       
    }
}

