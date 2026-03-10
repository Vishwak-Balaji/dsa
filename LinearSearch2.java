import java.util.*;

public class LinearSearch2  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Name :");
        String str = scan.nextLine();
        System.out.println();
        System.out.print("Enter the Target character :");
        char target = scan.next().charAt(0);

        boolean result = search(str,target);
        if(result == true){
            System.out.println("Yes it the name contain "+target+" in it.");
        }
        else{
            System.out.println("NO it doesnot contain "+target+" in it.");
        }

        
    }
    
        public static boolean search(String str , char target){
            if(str.length()==0){
                return false;
            }
            for(char ch : str.toCharArray()){
                if(ch == target){
                    return true;
                }
            }
            return false;
        }
    
}
