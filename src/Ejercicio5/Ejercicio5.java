package Ejercicio5;

public class Ejercicio5 {
    
    public static void ejercicio5(){
        int numaleatorio=0;
        int minimo=200;
        int maximo=0;
        int media=0;
        for(int i=1; i<=50;i++){
            numaleatorio = (int)(Math.random()*100+100);
            System.out.print(numaleatorio+" ");
            if(numaleatorio<minimo){
                minimo=numaleatorio;
            }
            if(numaleatorio>maximo){
                maximo=numaleatorio;
            }
            media=media+numaleatorio;
        }
        System.out.println("\nMínimo: "+minimo);
        System.out.println("Máximo: "+maximo);
        System.out.println("Media: "+media/50);
    }
}
