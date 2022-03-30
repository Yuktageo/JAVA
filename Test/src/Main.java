import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Please input 5 integer values:");
        Scanner sc=new Scanner(System.in);
        int[] array;
        array=new int[5];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
            sc.nextLine();

        }

        MethodsInJava p=new MethodsInJava();
        p.getOddValue(array);
        System.out.println("Odd values");
        p.displayOddValue(p.getOddValue(array));

    }
}