package BinarySearch;

public class InfinateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,11,12,13,14,15,17,19,20,23,25,27};
        int target = 14;
        System.out.println(ans(arr, target));
    }
    static int ans(int [] arr , int target){
        int start = 0;
        int end = 1;
        while(arr[end]<target){
            int temp = end+1;
            end = end + (end - start +1)*2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int [] arr , int target , int start , int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]< target){
                start = mid +1;
            }
            else if (arr[mid]>target){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
