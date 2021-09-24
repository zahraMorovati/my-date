import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //new date object
        MyDate myDate = new MyDate();

        try{
            //get input from user
            Scanner input= new Scanner(System.in);
            System.out.print("enter year: ");
            int year=input.nextInt();
            System.out.print("enter month: ");
            int month=input.nextInt();
            System.out.print("enter day: ");
            int day=input.nextInt();

            //test isValidDate method
            if(myDate.isValidDate(year,month,day)){
                System.out.println("the date you entered is valid!");
            }else {
                System.out.println("the date you entered is not valid!");
            }

            //test lastDayMonth method
            if(myDate.getMonthLastDay(month)!=-1){
                System.out.println("the last day of "+myDate.getMonthName(month)+" is "+myDate.getMonthLastDay(month));
            }else {
                System.out.println("invalid month number!");
            }

        }catch (InputMismatchException e) {
            System.out.println("Invalid input. ");
        }


    }


}
