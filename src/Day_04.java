 import java.io.*;
 import java.util.*;
 public class Day_04 {
     private int age;    
  
     public Day_04(int initialAge) {
         // Add some more code to run some checks on initialAge
         if (initialAge < 0){
             this.age = 0;
             System.out.println("Age is not valid, setting age to 0.");
         }
         else
             this.age = initialAge;
     }

     public void amIOld() {
         // Write code determining if this person's age is old and print the correct statement:
         String message;
         if (this.age < 13) 
             message = "You are young.";
         else
             if (this.age < 18) 
                 message = "You are a teenager.";
             else
                 message = "You are old.";
         System.out.println(message);
     }

     public void yearPasses() {
         // Increment this person's age.
         this.age++;
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int T = sc.nextInt();
         for (int i = 0; i < T; i++) {
             int age = sc.nextInt();
             Day_04 p = new Day_04(age);
             p.amIOld();
             for (int j = 0; j < 3; j++) {
                 p.yearPasses();
             }
             p.amIOld();
             System.out.println();
         }
         sc.close();
     }
 }
