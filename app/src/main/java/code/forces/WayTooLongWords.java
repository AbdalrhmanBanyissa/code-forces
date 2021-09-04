package code.forces;

import java.util.Scanner;

public class WayTooLongWords {
    public void wayTooLongWords(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] word = new String[n];
        word[0] = scanner.nextLine().toLowerCase();
        if(n>=1 && n<=100){
            for(int i = 0; i<n;i++){
                word[i]=scanner.nextLine().toLowerCase();
                if(word[i].length() > 10){
                    int j;
                    char[] letters = new char[word[i].length()];
                    for(j = 0; j < word[i].length(); j++)
                        letters[j] = word[i].charAt(j);
                    System.out.println((letters[0])+""+(word[i].length()-2)+""+(letters[j-1]));
                } else System.out.println(word[i]);
            }
        }
    }
}
