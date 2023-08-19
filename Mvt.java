import java.util.Scanner;
public class Mvt{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter ram size");
    int r=sc.nextInt();
    int temp=r;
    int []mp=new int[100];
    int z=0,n=0;
    for(int i=0;z==0;i++,n++){
       System.out.println("enter memory required");
       mp[i]=sc.nextInt();
       if(mp[i]<=temp){
           System.out.println("Memory allocated for"+(i+1));
           temp=temp-mp[i];
       }
       else{
          System.out.println("Memory is full");
          break;
      }
        System.out.println("do you want to continue");
        z=sc.nextInt();
  }
 System.out.println("total memory available"+r);
 System.out.println("process memory allocated");
 for(int i=0;i<n;i++)
      System.out.println(i+1+" "+mp[i]);
 System.out.println("total memory allocated"+(temp-r));
 System.out.println("external fragmentation"+temp);
}
}