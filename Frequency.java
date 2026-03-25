import java.util.ArrayList;
import java.util.Scanner;
public class Frequency { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] names={"john","anu","shiva"};
        int[] votes = {1, 2, 3, 1, 2, 1, 3, 2, 1};
        int[] count = new int[3];
        int max;
        int winner = 0;
        int name;
        for (int n:votes){
            count[n-1]++;
            
        }
        max =count[0];
        for(int i=1;i<3;i++){
            if(max < count[i]){
                max = count[i];
                winner = i;
            }
        }
        System.out.println("candiate nmaes");
        for(int i=0;i<3;i++){
            System.out.println("candidate name" +names[i] + "no of votes" + count[i]);
        }
        System.out.println(names[winner]);
        System.out.println("candidate name" +names[winner] + "no of votes" + count[winner]);


    
    }
}
