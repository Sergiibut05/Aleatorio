package Ejercicio3;

public class Ejercicio3 {
    public static void ejercicio3(){
        
        int numcarta= (int)(Math.random()*10)+1;
        int tipcarta = (int)(Math.random()*4)+1;
        switch (numcarta) {
            case 1:
                System.out.print("as");
                break;
            case 2:
                System.out.print(numcarta);
                break;
            case 3:
                System.out.print(numcarta);
                break;
            case 4:
                System.out.print(numcarta);
                break;
            case 5:
                System.out.print(numcarta);
                break;
            case 6:
                System.out.print(numcarta);
                break;
            case 7:
                System.out.print(numcarta);
                break;
            case 8:
                System.out.print("sota");
                break;
            case 9:
                System.out.print("caballo");
                break;
            case 10:
                System.out.print("rey");
                break;
            default:
                break;
        }
        System.out.print(" de ");
        switch (tipcarta) {
            case 1:
                System.out.print("bastos");
                break;
            case 2:
                System.out.print("oros");
                break;
            case 3:
                System.out.print("espadas");
                break;
            case 4:
                System.out.print("copas");
                break;
        
            default:
                break;
        }
    }
}
