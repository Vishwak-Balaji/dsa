import java.util.*;
public class EvenDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = scan.nextInt();
        int [] nums = new int [n];
        System.out.println("Enter the elements of an array :");
        for(int i =0;i<n;i++){
            nums[i]=scan.nextInt();
        }

        System.out.println("The count even are : "+findNumber(nums));

    }
    static int findNumber(int [] arr){
        int count =0;

        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits %2==0;
    }

    static int digits(int num){
        int count =0;
        while(num !=0){
            count++;
            num/=10;
        }
        return count;
    }

}
