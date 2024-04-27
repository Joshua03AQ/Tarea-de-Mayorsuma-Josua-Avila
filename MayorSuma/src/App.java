import java.util.Scanner;

public class App {
    public static int num1;
    public static int num2;
    public static int num3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Por favor ingrese numeros diferentes");
                System.out.println("Ingrese el primer numero");
                num1 = sc.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = sc.nextInt();
                System.out.println("Ingrese el tercer numero");
                num3 = sc.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Debe ingresar numeros");
                sc.nextLine();
            }
        } while (num1 == num2 || num1 == num3 || num2 == num3);
        Resultados(num1, num2, num3);
        sc.close();
    }
    public static void Resultados(int num1,int num2,int num3){
           //Suma de los menores
           if (num1<num3 && num2<num3) {
            int resultado1 = num1+num2;
            System.out.println("Suma de los menores= "+resultado1);
            int numeromayor1 = num3;
            System.out.println("Numero mayor= "+numeromayor1);
          }else{
            //diferencia de los mayores
             if (num1>num3 && num2>num3) {
                if (num1>num2) {
                    int resultado2 = num1-num2;
                System.out.println("diferencia de los numeros mayores= "+resultado2);
                }else{
                    int resultado2 = num2-num1;
                    System.out.println("diferencia de los numeros mayores= "+resultado2);
                }
             }
          }
          //suma de los menores
          if (num1<num2 && num3<num2) {
             int resultado3 = num1 + num3;
             System.out.println("Suma de los menores= "+resultado3);
             int numeromayor2 = num2;
             System.out.println("Numero mayor= "+numeromayor2);
          } else {
            //diferencia de los mayores
            if (num1>num2 && num3>num2) {
                if (num1>num3) {
                    int resultado4 = num1 - num3;
                    System.out.println("diferencia de los numeros mayores= "+resultado4);
                }else{
                    int resultado4 = num3 - num1;
                    System.out.println("diferencia de los numeros mayores= "+resultado4);
                }
            }
          }
          //suma de los menores
          if (num2<num1 && num3<num1) {
            int resultado5 = num2 + num3;
            System.out.println("Suma de los menores= "+resultado5 );
            int numeromayor3 = num1;
            System.out.println("Numero mayor= "+numeromayor3);
          } else {
            //diferencia de los mayores
            if (num2>num1 && num3>num1) {
                if (num2>num3) {
                    int resultado6 = num2-num3;
                    System.out.println("diferencia de los numeros mayores= "+resultado6);
                } else {
                    int resultado6 = num3-num2;
                    System.out.println("diferencia de los numeros mayores= "+resultado6);
                }
            }
          }     
    }  
}
