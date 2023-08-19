import java.util.Scanner;
public class Sjf{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int bt[]=new int[50];
    int at[]=new int[50];
    int wt[]=new int[50];
    int tat[]=new int[50];
    int n,i,j,temp1;
    String p[]=new String[50];
    String temp;

    System.out.println("enter no of pro");
    n=sc.nextInt();
    System.out.println("enter process names");
    for(i=0;i<n;i++)
        p[i]=sc.next();
    System.out.println("enter brust time");
    for(i=0;i<n;i++)
        bt[i]=sc.nextInt();
     System.out.println("enter arrival time");
    for(i=0;i<n;i++)
        at[i]=sc.nextInt();
    for(i=0;i<n;i++){
      for(j=i+1;j<n;j++){
          if(bt[i]>bt[j]){
             temp=p[i];
             p[i]=p[j];
             p[j]=temp;
    
             temp1=bt[i];
             bt[i]=bt[j];
             bt[j]=temp1;
    }
  }
}
wt[0]=0;
tat[0]=bt[0]-at[0];
for(i=1;i<n;i++){
   temp1=0;
   for(j=0;j<i;j++){
      temp1=temp1+bt[j];
    }
    wt[i]=temp1-at[i];
    tat[i]=temp1+bt[i]-at[i];
}

System.out.println("process"+"\t"+"AT"+"\t"+"BT"+"\t"+"WT"+"\t"+"TAT");
    for(i=0;i<n;i++)
       System.out.println(p[i]+"\t"+at[i]+"\t"+bt[i]+"\t"+wt[i]+"\t"+tat[i]); 
temp1=0; 
for(i=0;i<n;i++)
        temp1=temp1+wt[i];
System.out.println("awt"+(float)temp1/n);
temp1=0;
for(i=0;i<n;i++)
        temp1=temp1+tat[i];
System.out.println("atat"+(float)temp1/n);
}
}
   
    