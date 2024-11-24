package Ejercicio13;

public class Ejercicio13 {
    public static void ejercicio13(){
        System.out.print("Introduzca la anchura de la tableta: ");
        int anchura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la tableta: ");
        int altura = Integer.parseInt(System.console().readLine());
        int ymordida= (int)(Math.random()*altura+1);
        int xmordida= 0;
        int numaleatorio=0;
        if(ymordida==1 || ymordida==altura){
            xmordida=(int)(Math.random()*anchura+1);
        }else{
            numaleatorio=(int)(Math.random()*2);
            switch (numaleatorio) {
                case 0:
                    xmordida=1;
                    break;
                case 1:
                    xmordida=anchura;
                    break;
                default:
                    break;
            }
        }
        for(int i=1;i<=altura;i++){
            for(int j=1;j<=anchura;j++){
                if(i==ymordida){
                    if(j==xmordida){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
    }
}
