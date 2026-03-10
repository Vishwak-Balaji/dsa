import java.util.*;
public class FindMinimum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of an Array : ");
        int n = scan.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of Array: ");
        for(int i=0;i<n;i++){
            nums[i]=scan.nextInt();
        }
        int result = minimum(nums);
        System.out.println("The Minimum value in array is :"+result);
    }
    public static int minimum(int [] arr){

        if(arr.length <=0){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        
        for(int i : arr){
            if(i<min){
                min=i;
            }
        }
        return min;
    }

}
