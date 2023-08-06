import java.util.Scanner;

class Demo1 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);

        System.out.print("Input Number 1: ");
        int num1=input.nextInt();

        System.out.print("Input Number 2: ");
        int num2=input.nextInt();

        if (num1>num2){
            System.out.println(num1+" is greater than "+num2);

        } else if (num1<num2){
            System.out.println(num2+" is greater than "+num1);
        
        } else {
            System.out.println("Numbers are equal");
        }

    }

}