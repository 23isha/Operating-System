import java.util.Scanner;
public class Scan{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int sum=0;
     System.out.println("enter no of processes");
     int n=sc.nextInt();
     System.out.println("enter processes");
     int a[]=new int[n];
     for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
     System.out.println("enter start value");
     int s=sc.nextInt();
     System.out.println(s);
     for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
           if(a[j]>a[j+1]){
               int temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
    }
}
}
     boolean flag=false;
     for(int i=0;i<n;i++){
          if(s<a[i]){
          for(int j=i;j<n;j++){
           System.out.println("-->"+a[j]);
           sum+=Math.abs(s-a[j]);
           s=a[j];
          }
     
     System.out.println("-->"+"199");
     sum+=Math.abs(199-s);
     s=199;
     flag =true;
}
     if(flag){
       for(int j=i-1;j>=0;j--){
            System.out.println("-->"+a[j]);
           sum+=Math.abs(a[j]-s);
           s=a[j];
          }
        break;
     }
 System.out.println();
}
System.out.println("total no of seek operations"+sum);
}
}
               