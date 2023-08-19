import java.util.Scanner;
public class Dfcfs{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter processes");
    String a=sc.next();
    System.out.println("enter start point");
    int s=sc.nextInt();
    System.out.println(s);
    String []b=a.split(",");
    int sum=0;
    for(int i=0;i<b.length;i++){
          int j=Integer.parseInt(b[i]);
          System.out.println("-->"+j);
          sum=sum+Math.abs(s-j);
          s=j;
 }
 System.out.println();
 System.out.println("sum"+sum);
}
}
          
    