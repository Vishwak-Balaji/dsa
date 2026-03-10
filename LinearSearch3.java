//Search in a range
import java.util.*;
public class LinearSearch3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of an Array : ");
        int n = scan.nextInt();
        System.out.println();
        int [] nums = new int[n];
        System.out.print("Enter the elements of an array :");
        System.out.println();
        for(int i=0;i<n;i++){
            nums[i]=scan.nextInt();
        }
        System.out.print("Enter start index :");
        int start =scan.nextInt();
        System.out.println();
        System.out.print("End index :");
        int end =scan.nextInt();
        System.out.print("Enter the target element :");
        int target = scan.nextInt();
        
        int result = search(nums, target, start, end);
        System.out.println("The taret element lies in index :"+result);

    }
    public static int search(int [] arr , int target, int start, int end){
        if(arr.length <=0){
            return -1;
        }
        for(int index = start ; index <=end ; index++){
            if(target == arr[index]){
                return index;
            }
        }
        return -1;
        
    }
}
