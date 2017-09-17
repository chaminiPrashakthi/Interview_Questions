
/**
 *
 * @author chamini
 */
public class SecondMax {

    public static void SecondMax(int arr[]){
      // int [] seconMax =new int[arr.length];
        int max=arr[0];
        int seconMax=arr[0];
        for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
              seconMax=max;
              max=arr[i];
              
          }  
          else if(seconMax<arr[i] && arr[i]<max){
              seconMax=arr[i];
              max=max;
          }
          
        }
        
//        for(int j=0;j<arr.length;j++){
//            if(max> arr[j] && arr[j]> seconMax){
//             seconMax = arr[j];   
//            }
//        }
        System.out.println("second "+seconMax);
        System.out.println("max"+max);
       
    }
            
    public static void main(String[] args) {
       int[] arr={4,2,52,177,76,658,354, 5,65,2};
        SecondMax(arr);
    }
    
}
