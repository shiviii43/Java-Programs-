package Learn;
import java.util.Scanner;
public class days_months {
    @SuppressWarnings("resource")
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the month from 1 to 12 : ");
        int m = sc.nextInt();
        System.out.print("Enter the year : ");
        int y = sc.nextInt();
        switch(m){
            case 1 :
                System.out.println("January of the year "+y+" consists of 31 days.");
                break;
            case 2:
                if(( y%4==0 && y%100 !=0 )||( y%400 == 0 )){
                    System.out.println("Febuary of the year "+y+" consists of 29 days.");
                    break;
                }
                else{
                    System.out.println("Febuary of the year "+y+" consists of 28 days.");
                    break;
                }
            case 3:
                System.out.println("March of the year "+y+" consists of 31 days.");
                break;
            case 4:
                System.out.println("April of the year "+y+" consists of 30 days.");
                break;
            case 5: 
                System.out.println("May of the year "+y+" consists of 31 days.");
                break;
            case 6:
                System.out.println("June of the year "+y+" consists of 30 days.");
                break;
            case 7:
                System.out.println("July of the year "+y+" consists of 31 days.");
                break;
            case 8:
                System.out.println("August of the year "+y+" consists of 30 days.");
                break;
            case 9: 
                System.out.println("September of the year "+y+" consists of 31 days.");
                break;
            case 10:
                System.out.println("October of the year "+y+" consists of 30 days.");
                break;
            case 11:
                System.out.println("November of the year "+y+" consists of 31 days.");
                break;
            case 12:
                System.out.println("December of the year "+y+" consists of 30 days.");
                break;
            default:
                System.out.println("Please Enter a valid month number which ranges between 1-12!!");
                break;
        }
    }
}
