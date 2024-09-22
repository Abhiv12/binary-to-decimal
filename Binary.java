import java.util.*;
public class Binary
{
    public static void DecimalToBinary(int num)
    {
        int b[] = new int[30];
        int index = 0;
        while(num>0)
        {
            b[index] = num%2;
            num = num/2;
            index++;
        }
        System.out.println("Binary representation of given decimal value:");
        for(int i=index-1; i>=0; i--)
        {
            System.out.print(b[i]);
        }
    }

    public static void main(String[] args)
    {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number:-");
        num1 = sc.nextInt();
        DecimalToBinary(num1);
        sc.close();
        
    }
}