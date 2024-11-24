package Ejercicio8;

public class Ejercicio8 {
    public static void ejercicio8(){
        char matrix = (char) (Math.random()*94+33);
        for(int i=0;i<=10000;i++){
            matrix = (char) (Math.random()*94+33);
            System.out.print(matrix);
        } 
    }
}
