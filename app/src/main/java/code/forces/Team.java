package code.forces;

import java.util.Scanner;

public class Team {
    public int team(){
        int counter = 0;
        int output = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n ; i++){
            int[] lines = new int[3];
            for(int j = 0; j < lines.length; j++){
//                lines[j] = Math.round(Math.random()*1);
                lines[j] = scanner.nextInt();
                if(lines[j] == 1)
                    counter++;
            }
            if(counter >= 2)
                output++;
            counter = 0;
        }
        return output;
    }
}
