import java.util.Scanner;
public class BoundedBuffer{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     Example e=new Example();
     while(true){
     System.out.println("enter ch");
     int ch=sc.nextInt();
      switch(ch){
      case 1:e.producer();
             break;
      case 2:e.counsumer();
             break;
      case 3:e.display();
             break;
     default:System.exit(0);
      }
   }
 }
}
class Example{
  int count=0,in=0,out=0;
  int buffer[]=new int[50];
  int buffersize=10;
  Scanner sc=new Scanner(System.in);
  public void producer(){
    if(count!=buffersize){
        System.out.println("enter ele to be inserted");
        int item=sc.nextInt();
        buffer[in]=item;
        in=(in+1)%buffersize;
        count++;
        System.out.println("item produced"+item);
    }
    else{
     System.out.println("queue is empty");
   }
}
 public void counsumer(){
    if(count!=0){
       int item=buffer[out];
       out=(out+1)%buffersize;
       count--;
       System.out.println("item counsumed"+item);
    }
    else{
       System.out.println("queue is empty");
}
}
public void display(){
 for(int i=0;i<in;i++){
   System.out.println("items"+buffer[i]);
} 
}
}