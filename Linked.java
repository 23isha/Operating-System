import java.util.Scanner;
public class Linked{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int f[]=new int[50];
    for(int i=0;i<50;i++)
        f[i]=0;
    System.out.println("enter how many blocks already allocated");
    int p=sc.nextInt();
    System.out.println("enter blocks already allocated");
    for(int i=0;i<=p;i++){
       int a=sc.nextInt();
       f[a]=1;
}
alloFun(f);
while(true){
   System.out.println("Do you want to continue");
   int c=sc.nextInt();
    if(c==1)
           alloFun(f);
    else
          System.exit(0);
}
}
public static void alloFun(int f[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter starting and length");
   int start=sc.nextInt();
   int length=sc.nextInt();
   int k=length;
   for(int i=start;i<(start+k);i++){
   if(f[i]==0){
      f[i]=1;
       System.out.println(i+"-->"+f[i]);
}
else{
  System.out.println("block is already allocated");
  k++;
}
}
}
}
     
   
