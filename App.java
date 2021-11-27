import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        System.out.println("Enter a digit");
        Scanner num = new Scanner(System.in);
        int intnum = num.nextInt();
        boolean isPrime = true;
        for(int i = 2;i<intnum;i++){
            if(intnum%i==0){
                isPrime = false;
                break;
            }
            
        }
        if(isPrime){
            System.out.println(intnum+" is a prime number");
        }else{
            System.out.println(intnum+" is not a prime number");
        }
    }
}