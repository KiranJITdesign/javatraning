import java.util.Scanner;
public class Searching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr={12,10,34,23};
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              if(arr[i]>arr[j]){
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
            }
        }
        System.out.println("sorted array");
        for(int n:arr){
            System.out.println(n);
        }
    }
}
