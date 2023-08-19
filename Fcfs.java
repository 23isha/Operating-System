import java.util.Scanner;
public class Fcfs{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int bt[]=new int[50];
    int wt[]=new int[50];
    int tat[]=new int[50];
    int n,i,temp=0;
    System.out.println("enter no of pro");
    n=sc.nextInt();
    System.out.println("enter brust time");
    for(i=0;i<n;i++)
        bt[i]=sc.nextInt();
    wt[0]=0;
    for(i=1;i<n;i++)
        wt[i]=wt[i-1]+bt[i-1];
    for(i=0;i<n;i++)
        tat[i]=wt[i]+bt[i];
    System.out.println("process"+"\t"+"BT"+"\t"+"WT"+"\t"+"TAT");
    for(i=0;i<n;i++)
       System.out.println(i+1+"\t"+bt[i]+"\t"+wt[i]+"\t"+tat[i]);
   for(i=0;i<n;i++)
        temp=temp+wt[i];
   System.out.println("awt"+temp/n);
   for(i=0;i<n;i++)
        temp=temp+tat[i];
   System.out.println("awt"+temp/n);
}
}