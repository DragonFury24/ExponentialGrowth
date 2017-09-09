import java.util.*;

public class RecursiveGrowthMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the initial number of organisms: ");
        int initOrganisms = keyboard.nextInt();
        System.out.println("Enter the growth rate: ");
        int growthRate = keyboard.nextInt();
        System.out.println("Enter the time (hours) needed to achieve the growth rate: ");
        int time = keyboard.nextInt();
        System.out.println("Enter the observation time (hours): ");
        int obsTime = keyboard.nextInt();
        int endOrganismsNum = initOrganisms;
        for (int i = 0; i < (obsTime / time); i++)
            endOrganismsNum *= growthRate;
        System.out.println("After " + obsTime + " hours there will be " + endOrganismsNum + " organisms.");
    }
}
