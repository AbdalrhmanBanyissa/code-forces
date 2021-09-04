package code.forces;

import java.util.Scanner;

public class Watermelon {
    public void watermelon(){
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if(w%2==0 && w>=1 && w<=100)
            System.out.println("YES");
        else if(w%2!=0 && w>=1 && w<=100) System.out.println("NO");
    }
}
