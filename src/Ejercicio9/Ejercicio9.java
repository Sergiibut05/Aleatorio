package Ejercicio9;

public class Ejercicio9 {
    public static void ejercico9(){
        int dado1 = 0;
        int dado2 = 1;
        while(dado1!=dado2){
            dado1 = (int)(Math.random()*6+1);
            dado2 = (int)(Math.random()*6+1);
            System.err.println(dado1+" "+dado2);
        }
    }
}
