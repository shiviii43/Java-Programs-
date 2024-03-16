//Convert Kilometers to miles.      1 km  = 0.621371 miles
package Learn;

import java.util.Scanner;
public class km_m {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in Kilometers :");
        float km = sc.nextFloat();
        System.out.println("The Distance in Miles is "+(km/1.609));
    }
}
