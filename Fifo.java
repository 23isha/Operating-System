import java.util.*;
public class fifo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the no.of pages");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the pages values");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("enter the no.of frames");
int m=sc.nextInt();
int b[]=new int[m];
for(int i=0;i<m;i++){
b[i]=-1;
}
int f=0;
int s=0;
for(int i=0;i<n;i++){
int count=0;
for(int j=0;j<m;j++){
if(a[i]!=b[j]){
count++;
}
}
if(count==m){
b[s]=a[i];
s=(s+1)%m;
f++;
}
}
System.out.println("page fault "+f);
}
}