package problem3;

public class Program {
  public static IntPair[] allPairs(int[] arr) throws IllegalArgumentException{
    if(arr == null)
      throw new IllegalArgumentException(); 
    
    IntPair[] result = new IntPair[arr.length * arr.length];
    
    int index = 0;
    
    for(int i : arr) {
      for(int j : arr) {
        result[index] = new IntPair(i, j);
        index++;
      }
    }
    
    return result;
  }
  
  public static void main(String[] args) {
    int[] arr = {3,5,9};
    
    IntPair[] result = allPairs(arr);
    
    for(IntPair p : result)
      System.out.println("(" + p.getFst() + ", " + p.getSnd() + ")");
  }
}
