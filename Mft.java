import java.util.Scanner;
public class Mft{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  float sum=0;
  System.out.println("Enter ram size");
  int r=sc.nextInt();
  System.out.println("Enter no of processes");
  int n=sc.nextInt();
  System.out.println("Enter partion size");
  int m=r/n;
  int []a=new int[n];
  int []f=new int[n];
  String []ar=new String[n];
  for(int i=0;i<n;i++){
       System.out.println("enter process"+i+1+"size");
       a[i]=sc.nextInt();}
  for(int i=0;i<n;i++){
        if(a[i]<=m){
          f[i]=m-a[i];
          ar[i]=null;
        }
        else{
           ar[i]="cln";}
}
for(int i=0;i<n;i++)
    sum+=f[i];
System.out.println("Proces no"+"\t"+"process"+"\t"+"fragmentation");
for(int i=0;i<n;i++){
  if(a[i]<m)
      System.out.println(i+1+"\t"+a[i]+"\t"+f[i]);
  else
      System.out.println(i+1+"\t"+a[i]+"\t"+ar[i]);
}
System.out.println("internal fragmentation"+sum);
}
}