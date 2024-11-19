package Ejercicio6;

public class Ejercicio6_2 {
    public static void ejemplo6(){
        System.out.println("Introduce un número: ");
        int numaleatorio=Integer.parseInt(System.console().readLine());
        int num=0;
        for(int i=1;i<=5;i++){
            System.out.print("Introduce un número: ");
            num=Integer.parseInt(System.console().readLine());
            if(num>numaleatorio){
                System.out.println("El número que estoy pensando es menor que "+num);
            }else{
                if(num<numaleatorio){
                    System.out.println("El número que estoy pensando es mayor que "+num);
                }else{
                    System.out.println("¡Felecidades! Has Acertado");
                    i=8;
                }
            }
        }
        if(num!=numaleatorio){
            System.out.println("Que pena, no has acertado");
        }
    }
}
