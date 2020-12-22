import java.util.Scanner;


public class AbstractionDao extends Abstraction {

    public void studentComplaints () {
        System.out.println("Enter the overall performance of the special classes on the scale of 5  :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n);
    }
}

