import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_26 {

    public static void main(String[] args) {
   		Scanner in = new Scanner(System.in);
		int dayRet = in.nextInt();int monRet = in.nextInt();int yeaRet = in.nextInt();
		int dayExp = in.nextInt();int monExp = in.nextInt();int yeaExp = in.nextInt();
        if (yeaRet == yeaExp){
            if (monRet == monExp){
                if (dayRet <= dayExp){
                    System.out.println(0);                    
                }else
                    System.out.println((dayRet>dayExp) ? (dayRet-dayExp)*15 : 0);
            }else
                System.out.println((monRet>monExp) ? (monRet-monExp)*500 : 0);
        }else
            System.out.println((yeaRet>yeaExp) ? 10000 : 0);
    }
}
// 09 09 2017
// 06 09 2017
