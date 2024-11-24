package Ejercicio14;

public class Ejercicio14 {
    public static void ejercicio14(){
        int altura=2;
        while(altura%2==0){
            altura=(int)(Math.random()*11+3);
        }
        for(int i=1;i<=altura;i++){
            if(i==1){
                System.out.print("*    *   ****   *        ****");
            }else{
                if(i==(int)(altura/2+1)){
                    System.out.print("******  *    *  *       ******");
                }else{
                    if(i==altura){
                        System.out.print("*    *   ****   ******  *    *");
                    }else{
                        System.out.print("*    *  *    *  *       *    *");
                    }
                }

            }
            System.out.println();
        }
        
    }
}
