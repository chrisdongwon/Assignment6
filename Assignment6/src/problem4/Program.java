package problem4;

public class Program {
  public static String concatAndReplicateAll(String[] arr, int n) throws IllegalArgumentException {
    if(arr == null)
      throw new IllegalArgumentException();
    
    String result = "";
    
    for(String s : arr) {
      for(int i = 0; i < n; i++)
        result += s;
    }
    
    return result;
  }

  public static void main(String[] args) {
    String[] arr = {"hello", "world", "!"};
    System.out.println(concatAndReplicateAll(arr, 3));
  }
}
