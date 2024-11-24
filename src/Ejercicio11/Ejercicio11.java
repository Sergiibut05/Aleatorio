package Ejercicio11;

public class Ejercicio11 {
    public static void ejercicio11(){
        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        
        int altura = Integer.parseInt(System.console().readLine());
        int numaleatorio = (int)(Math.random()*altura+1);
        for(int i=altura; i>=1;i--){
            System.out.println();
            if(i<=numaleatorio){
                System.out.print("#====#");
            }else{
                System.out.print("#    #");
            }
        }
        System.out.println();
        System.out.print("######");
        System.out.printf("\nLa cuba tiene una capacidad de %d litros y contiene %d litros de agua.",altura,numaleatorio);
    }
}
