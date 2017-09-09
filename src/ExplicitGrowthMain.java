import java.util.*;

public class ExplicitGrowthMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the initial number of organisms: ");
        int initOrganisms = keyboard.nextInt();
        System.out.println("Enter the growth rate: ");
        double growthRate = keyboard.nextInt();
        System.out.println("Enter the time (hours) needed to achieve the growth rate: ");
        double time = keyboard.nextInt();
        System.out.println("Enter the observation time (hours): ");
        double obsTime = keyboard.nextInt();
        double growthConstant = Math.log(growthRate) / time;
        System.out.println("After " + obsTime + " hours there will be " + (int)(initOrganisms * Math.pow(Math.E, obsTime * growthConstant)) + " organisms.");
    }
}
