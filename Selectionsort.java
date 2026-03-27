import java.util.Scanner;
public class Selectionsort {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr={12,10,34,23};
        int n = arr.length;
        System.out.println("original array");
        for(int num:arr){
            System.out.println(num);
        }
        for(int i =0; i< n-1; i++){
            int minidx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minidx]){
                    minidx = j;
                }
            }
            int temp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("sorted array");
        for(int num:arr){
            System.out.println(num);
        }
    }
}
