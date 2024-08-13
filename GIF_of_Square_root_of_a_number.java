import java.util.*;
public class GIF_of_Square_root_of_a_number{
  public static void main(String[] args){
    Scanner Sc=new Scanner(System.in);
    System.out.print("Enter number for Square root: ");
    int n=Sc.nextInt();
    System.out.println("The GIF of square root of "+n+" is "+answer(n));
  }
  static int answer(int n){
    if(n==0||n==1)
      return n;
    int low=1,high=n;
    while(low<=high){
      int mid=low+(high-low)/2;
      if(mid==n/mid)
        return mid;
      else if(mid>n/mid)
        high=mid-1;
      else
        low=mid+1;
    }
    return high;
  }
}
