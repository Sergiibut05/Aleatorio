package Ejercicio1;

public class Ejercicio1{
    public static void ejercicio1(){
        System.out.print("Tirada de tres dados: ");
        int numAleatorio=0;
        int sumatorio=0;
        for(int i=1;i<=3;i++){
            numAleatorio=(int)(Math.random()*6+1);
            System.out.print(numAleatorio+" ");
            sumatorio=sumatorio+numAleatorio;
        }
        System.out.println("\nSuma: "+sumatorio);
        
    }
}