package Ejercicio10;

public class Ejercicio10 {
    public static void ejercicio10(){
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("\nAhora introduzca la anchura (como mínimo 4): ");
        int anchura = Integer.parseInt(System.console().readLine());
        int ypez = (int)(Math.random()*(altura-2)+2);
        int xpez = (int)(Math.random()*(anchura-2)+1);
        for(int i =1;i<=altura;i++){
            if(i==1 || i==altura){
                for(int j=1;j<=anchura;j++){
                    System.out.print("* ");
                }
            }else{
                
                if(i==ypez){
                    System.out.print("* ");
                    for(int h=1;h<=anchura-2;h++){
                        if(h==xpez){
                            System.out.print(" &");
                        }else{
                            System.out.print("  ");
                        }
                    }
                    System.out.print("*");
                }else{
                    System.out.print("* ");
                    for(int k=1;k<=anchura-2;k++){
                        System.out.print("  ");
                    }
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
    }
}
