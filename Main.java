import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        float salario = leer.nextFloat();
        leer.close();
        if(salario < 1000){
            salario = salario*1.45f;
        }
        System.out.println("su salario es de: $"+salario);
    }

}