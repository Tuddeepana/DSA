public class LeanerSearch {


    public static void main(String[] args) {

        int []ar= {2,4,5,6,67,87,6};
        int data =6;

        int result = search(ar,data);
        System.out.println("Result: "+ result);

        if (result!=-1){
            System.out.println("Result found");
        }else {
            System.out.println("Not in array");
        }




    }
    public static int search(int []arr,int data){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==data){
                return i; //Element Found--> print Index
            }
        }
        return -1;

    }
}
