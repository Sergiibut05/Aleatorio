package Ejercicio2;

public class Ejercicio2 {
    public static void ejercicio2(){
        
        int numcarta= (int)(Math.random()*13)+1;
        int tipcarta = (int)(Math.random()*4)+1;
        switch (numcarta) {
            case 1:
                System.out.print("A");
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
                System.out.print(numcarta);
                break;
            case 9:
                System.out.print(numcarta);
                break;
            case 10:
                System.out.print(numcarta);
                break;
            case 11:
                System.out.print("J");
                break;
            case 12:
                System.out.print("Q");
                break;
            case 13:
                System.out.print("K");
                break;
        
            default:
                break;
        }
        System.out.print(" de ");
        switch (tipcarta) {
            case 1:
                System.out.print("diamantes");
                break;
            case 2:
                System.out.print("corazones");
                break;
            case 3:
                System.out.print("picas");
                break;
            case 4:
                System.out.print("tréboles");
                break;
        
            default:
                break;
        }
    }
}
