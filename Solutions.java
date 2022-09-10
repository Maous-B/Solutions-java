package maous.xyz;

import java.util.Scanner;

public class Solutions {

    public static void calcul(int x,int y,int z){
        int delta = (int)Math.pow(y, 2) - (4 * x * z);
        System.out.println("delta : " + delta);
        if(delta < 0){
            System.out.println("La fonction n'admet aucune racine");
        }
        else if(delta > 0){
            double x1, x2;
            System.out.println("La fonction admet deux racines");
            x1 = (y-Math.sqrt(delta)) / 2*x;
            x2 = (y+Math.sqrt(delta)) / 2*x;
            System.out.println("x1 : " + x1);
            System.out.println("x2 : " + x2);
        }
        else if(delta == 0){
            System.out.println("La fonction admet une racine");
        }
    }
    public static void main(String args[]){
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax² + bx + c");
        System.out.println("Entrez a : ");
        a = scanner.nextInt();
        System.out.println("Entrez b : ");
        b = scanner.nextInt();
        System.out.println("Entrez c : ");
        c = scanner.nextInt();
        calcul(a,b,c);

    }
}
