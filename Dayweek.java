import java.lang.*;
import java.util.*;

public class Dayweek
{
    public static void main(String[] args){
        int Day=0;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter a Day number(1-7): ");
        Day=S.nextInt();

        if( Day <= 0 || Day > 7)
        {
            System.out.println("Invalid Day number");
        }
        else if(Day == 1)
        {
            System.out.println("Monday");
        }
         else if(Day == 2)
         {
             System.out.println("Tuesday");
         }
         else if(Day == 3)
         {
            System.out.println("Wednesday");
         }
         else if(Day == 4)
         {
            System.out.println("Thursday");
         }
         else if(Day == 5)
         {
            System.out.println("Friday");
         }
         else if(Day == 6)
         {
            System.out.println("Saturday");
         }
         else if(Day == 7)
         {
            System.out.println("Sunday");
         }
         System.out.println("Thanks");
    }
    }


    