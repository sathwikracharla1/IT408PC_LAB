import java.util.Scanner;
public class L5P1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("please enter your age :");
            int age=s.nextInt();
            if(age<18)
                throw new AgeException("sorry not eligible to vote ");
            else
                System.out.println("eligible to vote.");
        }catch (AgeException ae){
            System.out.println(ae.getMessage());
        }
    }

}
