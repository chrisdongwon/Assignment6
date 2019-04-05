package problem1;

public class Contains {
  public static boolean contains(double[] dubs, double eps, double d) {
    for(double x : dubs)
      if (Math.abs(x - d) < eps) return true;
    return false;
  }

  public static void main(String[] args) {    
    double[] arr1 = {1.2, 3.2, 47.2};
    
    System.out.println(contains(arr1, 0.5, 1));
    System.out.println(contains(arr1, 0.1, 1));
    System.out.println(contains(arr1, 0.01, 47.2));
  }
}
