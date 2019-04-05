package problem2;

public class FastExponentiation {
  static int count = 0;
  
  public static long fastModExp(long x, long y, long m) {
    if(y == 0) return 1;
    if(y % 2 == 0) return fastModExp((x * x) % m, y / 2, m);
    return (x * fastModExp(x, y-1, m)) % m;
  }
  
  public static void main(String[] args) {    
    System.out.println(fastModExp(123,16,789));
    System.out.println(count);
  }
}
