package BinarySearch;
import java.util.*;
public class celing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = scan.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the target element : ");
        int target = scan.nextInt();

        int result = BS_Celing(arr, target);
        System.out.println("The index of the target is : "+result);

    }
    public static int BS_Celing(int[]arr,int target){
        int start =0;
        int end = arr.length-1;
        while(start <=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
