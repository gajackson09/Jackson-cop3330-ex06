/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program determines how many years you have left until retirement and the year you can retire 
import java.util.Scanner;
import java.util.Calendar;
public class ex06{
    public static void main(String[] args){
        //declaring variables
        int currentAge;
        int retirementAge;
        
        Scanner input = new Scanner(System.in);
            System.out.print("What is your current age? ");
                currentAge = input.nextInt();
            System.out.print("At what age would you like to retire? ");
                retirementAge = input.nextInt();

            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int yearsLeftToRetirement = retirementAge-currentAge;

            if(yearsLeftToRetirement >= 0){
                int retirementYear = currentYear + yearsLeftToRetirement;       
                System.out.println("You have "+yearsLeftToRetirement +" years left until you can retire.");
                System.out.println("It's "+currentYear+", so you can retire in "+retirementYear+".");
            }//end of if
        }//end of main
}//end of class