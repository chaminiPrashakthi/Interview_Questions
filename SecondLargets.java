

/**
 *
 * @author chamini
 */
public class SecondLargets {

   public static void selectionSort(int[] arr){
      for(int i=0;i<arr.length-1;i++){
          int indexmin= i;
          
          for(int j=i+1;j<arr.length;j++){
              if(arr[j]<arr[indexmin]){
                  indexmin=j;
              }
          }
              
              int temp= arr[indexmin];
              arr[indexmin] = arr[i];
              arr[i]= temp;
          }
      }
    public static void main(String[] args) {
        int [] arr={6,3,4,1,8,9};
       // for (int i=0;i<arr.length;i++){
            selectionSort(arr);
       // }
       
        System.out.println(arr[1]);
        
        
        
    }
    
}
