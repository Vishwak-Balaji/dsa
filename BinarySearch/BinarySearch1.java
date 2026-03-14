package BinarySearch;

import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = scan.nextInt();
        int [] numbers = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            numbers[i]= scan.nextInt();
        }
        System.out.print("Enter the target : ");
        int target = scan.nextInt();
        System.out.println(binarySearch(numbers, target));
        
    }
    static int binarySearch(int [] arr,int target){
        int start =0; 
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start =mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
