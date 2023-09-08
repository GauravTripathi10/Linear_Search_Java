import java.util.Scanner;

public class Linear_search_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int target; 
        System.out.println("Enter the Size of the array");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("enter the element of array");
        for(int i=0;i<size;i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the Target element");
        target=sc.nextInt();
        int ans=linearSearch(array, target);
        System.out.println(ans);
     }
    

    static int linearSearch(int[] arr , int target){
        // check the length of the array
        if(arr.length==0){
            return -1;
        }
        // Search the target element in the array
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==target){
                return i;
            }

        }
        // If the Searching is complete and the target element is not found, return -1
        return -1;
    }
}
