package Ejercicio6;

public class Ejercicio6 {
    public static void ejercicio6(){
        System.out.println("Estoy pensando un número del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades.");
        int numaleatorio=(int)(Math.random()*101);
        int num=0;
        for(int i=1;i<=7;i++){
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
