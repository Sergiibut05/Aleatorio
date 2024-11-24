package Ejercicio15;

public class Ejercicio15 {
    public static void ejercicio15(){
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("\nAhora introduzca la anchura (como mínimo 4): ");
        int anchura = Integer.parseInt(System.console().readLine());
        int ypez = (int)(Math.random()*(altura-2)+2);
        int xpez = (int)(Math.random()*(anchura-2)+1);
        int ycaracol = (int)(Math.random()*(altura-2)+2);
        int xcaracol = (int)(Math.random()*(anchura-2)+1);
        int ycaballo = (int)(Math.random()*(altura-2)+2);
        int xcaballo = (int)(Math.random()*(anchura-2)+1);
        if(ycaracol == ypez){
            while(xcaracol==xpez){
                xcaracol = (int)(Math.random()*(anchura-2)+1);
            }
        }
        if(ycaballo==ycaracol || ycaballo==ypez){
            while(xcaballo==xcaracol || xcaballo==xpez){
                xcaballo=(int)(Math.random()*(anchura-2)+1);
            }
        }
        
        for(int i =1;i<=altura;i++){
            if(i==1 || i==altura){
                for(int j=1;j<=anchura;j++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");
                for(int h=1;h<=anchura-2;h++){
                    if(i==ypez && h==xpez){
                        System.out.print("& ");
                    }else{
                        if(i==ycaballo && h==xcaballo){
                            System.out.print("$ ");
                        }else{
                            if(i==ycaracol && h==xcaracol){
                                System.out.print("@ ");
                            }else{
                                System.out.print("  ");
                            }
                            
                        }
                        
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
