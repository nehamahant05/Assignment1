package Assign;

import java.util.Scanner;

public class TernaryOperator {

    public void greaterNumber(int x,int y)
    {
        String result=(x>y)?"Xis greater":"Y is greater";
        System.out.println("ternary example------>"+result);

        //////
        Scanner scan=new Scanner(System.in);
        String user;
        int age;
        System.out.println("Enter user Name");
        user=scan.nextLine();
        System.out.println("Enter user Age");
        age=scan.nextInt();
        System.out.println("user Name is-------------"+user);
        System.out.println("user Age is-------------"+age);
        scan.close();
    }
}
