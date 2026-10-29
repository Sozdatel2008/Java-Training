public class Square {    
    public static boolean isSquare(int n) {
      if(n == 0)
        return true;
      int root = (int)Math.sqrt(n);
      if(root*root == n & n > 0)  
        return true;
      return false;
    }
}