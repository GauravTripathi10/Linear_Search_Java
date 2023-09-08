import java.util.Scanner;

class Linear_Search{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={};
        System.out.println("Please enter the target element");
        int target=sc.nextInt();
        // linear Search algorithm
        if(arr.length==0){
           System.out.println("Element does't exists");
        }
        //Search for the target element
        else{
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==target){
                System.out.println("The index is "+ i);
            }
        }
        System.out.println("Element not found");
    }

    }
}