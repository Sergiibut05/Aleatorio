package Ejercicio7;

public class Ejercicio7 {
    public static void ejercico7(){
        int numaleatorio = (int)(Math.random()*5);
        int numsuspensos =0;
        int numsuficientes=0;
        int numbienes=0;
        int numnotables=0;
        int numsobresalientes=0;
        for (int i=1; i<=20;i++){
            numaleatorio = (int)(Math.random()*5);
            switch (numaleatorio) {
                case 0:
                    System.out.print("supenso ");
                    numsuspensos=numsuspensos+1;
                    break;
                case 1:
                    System.out.print("suficiente ");
                    numsuficientes=numsuficientes+1;
                    break;
                case 2:
                    System.out.print("bien ");
                    numbienes=numbienes+1;
                    break;
                case 3:
                    System.out.print("notable ");
                    numnotables=numnotables+1;
                    break;
                case 4:
                    System.out.print("sobresaliente ");
                    numsobresalientes=numsobresalientes+1;
                    break;
                default:
                    break;
            }

        }
        System.out.println("\nSuspensos: "+numsuspensos);
        System.out.println("Suficientes "+numsuficientes);
        System.out.println("Bienes: "+numbienes);
        System.out.println("Notables: "+numnotables);
        System.out.println("Sobresalientes: "+numsobresalientes);
    }
}
