import java.util.Scanner;

//Functional Interface
interface ProductionOfNumber{
    void productionOfNumber(long Num1,long Num2);
}

//main class
public class Lambda4{
    public static void main(String[] args) {
        long Num1,Num2;
        Scanner ic = new Scanner(System.in);
        try{
        System.out.println("Enter two Number:");
        Num1 = ic.nextLong();
        Num2 = ic.nextLong();

        //Lambda Expression
        ProductionOfNumber obj = (long num1,long num2)-> {
            long result = num1;
            for(long i = num1+1 ; i <= num2; i++){ result *= i; }
            System.out.println(result);
        };
        
        obj.productionOfNumber(Num1, Num2);
        }
        finally{
            ic.close();
        }
        
    }
}