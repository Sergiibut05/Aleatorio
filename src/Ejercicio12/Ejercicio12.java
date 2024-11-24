package Ejercicio12;

public class Ejercicio12 {
    public static void ejercicio12(){
        System.out.println("Por favor, introduzca la longitud de la serpiente contando la cabeza: ");
        int longserpiente = Integer.parseInt(System.console().readLine());
        int espacios =12;
        int numaleatorio=0;
        for(int k=1; k<=espacios;k++){
            System.out.print(" ");
        }
        System.out.print("@\n");
        for(int i=1;i<=longserpiente-1;i++){
            numaleatorio=(int)(Math.random()*3-1);
            espacios = espacios+numaleatorio;
            for(int k=1; k<=espacios;k++){
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }
    }
}
