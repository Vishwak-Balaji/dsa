import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size :");
        int n = scan.nextInt();
        System.out.println();
        System.out.print("Enter the target :");
        int target = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        int result = Search(arr, target);
        System.out.println("The index of the Targeted element is :"+result);
    }
    static int Search(int []arr, int index){
        if(arr.length <=0){
            return -1;
        }
        for(int i=0 ;i<arr.length;i++){
            if(arr[i]== index){
                return i;
            }
        }
        return -1;
    }
}
