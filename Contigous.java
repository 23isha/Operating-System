import java.util.Scanner;
public class Contigous{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int start[]=new int[4];
  int length[]=new int[4];
  String name[]=new String[4];
  for(int i=0;i<4;i++){
     System.out.println("enter file-name,start val,length for process"+(i+1));
     name[i]=sc.next();
     start[i]=sc.nextInt();
     length[i]=sc.nextInt();
}
 System.out.println("file-name"+"\t"+"start"+"\t"+"length"+"\t");
for(int i=0;i<4;i++){
     System.out.println(name[i]+"\t"+start[i]+"\t"+length[i]+"\t");
     for(int j=start[i];j<start[i]+length[i];j++){
            System.out.println(j+",");
}
 System.out.println();
}
}

}
     
   