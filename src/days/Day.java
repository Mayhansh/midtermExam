/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 jn 22nd
 */
public class Day {
    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number:0(Monday) to 6(Sunday)");
        
        int code = in.nextInt();
        if (code>=0 && code <Days.values().length){
            Days selectedDay = Days.values()[code];
            System.out.println("you selected: " + selectedDay);
            
        }else{
            System.out.println("Invalid day number");
        }
        System.out.println("Printing all days");
        Weekdays weekdays = new Weekdays();
        weekdays.printAllDays();
    }
    }
