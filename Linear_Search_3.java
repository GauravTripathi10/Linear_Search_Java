import java.util.Scanner;

public class Linear_Search_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size=scan.nextInt();
        int[] array=new int[size];
        System.out.println("enter array element ");
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("Enter target element");
        int target=scan.nextInt();
        int ans=linearSearch(array, target);
        System.out.println(ans);
    }
    // Search the Target element and return the element
    static int linearSearch(int[] arr,int target){
        if(arr.length ==0){
            return -1;
        }
        // for Each loop 
        for(int ans:arr){
            if(ans==target){
                return ans;
            }
        }
        // if the element not found, return -1
        return -1;

    }
    
}
