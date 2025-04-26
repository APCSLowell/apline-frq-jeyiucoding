public class APLine
{
  private int a,b,c;
  public APLine(int ai, bi, ci){
    a = ai;
    b = bi;
    c = ci;
  }
  public double getSlope(){
    double slope = -(a)/b;
    return slope;
  }
  public boolean isOnLine(int x, int y){
    if((a(x) +b(y) + c) == 0){
      return true;
    }
    return false;
}
