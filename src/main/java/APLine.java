public class APLine
{
  private int a,b,c;
  public APLine(int ai, int bi, int ci){
    a = ai;
    b = bi;
    c = ci;
  }
  public double getSlope(){
    double slope = -(double)a/b;
    return slope;
  }
  public boolean isOnLine(int x, int y){
    if((a*x) + (b*y) + c == 0){
      return true;
    }
    return false;
  }
}
