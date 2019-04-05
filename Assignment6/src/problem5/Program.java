package problem5;

public class Program {
  public static int[] interleave(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    
    int i = 0;
    int j = 0;
    int index = 0;
    
    while(i < arr1.length && j < arr2.length) {
      result[index] = arr1[i++];
      index++;
      result[index] = arr2[j++];
      index++;
    }
    
    if(arr1.length > arr2.length) {
      for(int k = index; k < result.length; k++)
        result[k] = arr1[i++];
    }
    else if(arr1.length < arr2.length) {
      for(int k = index; k < result.length; k++)
        result[k] = arr2[j++];
    }
    
    return result;
  }
  
  public static void main(String[] args) {
    int[] arr1 = {0,1,2};
    int[] arr2 = {3, 4, 5, 6, 7, 8};
    
    for(int x : interleave(arr1,arr2))
        System.out.println(x);
  }
}
