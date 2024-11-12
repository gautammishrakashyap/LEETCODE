import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = scanner.nextInt();
        
        if(num1%2==0){
            System.out.println("yes it is an even number");
        }
        else{
            System.out.println("sorry so say he is no more");
        }
    }
}
