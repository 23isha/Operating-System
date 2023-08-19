import java.util.concurrent.Semaphore;
class ReaderWriter{
  Semaphore mutex=new Semaphore(1);
  Semaphore wrt=new Semaphore(1);
  int readerCounter=0;

  void startRead(){
    try{
        mutex.acquire();
        readerCounter++;
        if(readerCounter==1){
           wrt.acquire();}
        mutex.release();
        System.out.println("reading shared resources");
   }
    catch(Exception e){
        e.printStackTrace();
  }
}
 void endRead(){
   try{
      mutex.acquire();
      readerCounter--;
      if(readerCounter==0)
          wrt.release();
      mutex.release();
}
      catch(Exception e){
         e.printStackTrace();
  } 
}  
 
void startWrite(){
    try{
       wrt.acquire();
       System.out.println("writting shared resources");
}
       catch(Exception e){
          e.printStackTrace();
  }
}

void endWrite(){
    wrt.release();
    
  }
}

class Reader implements Runnable{
     ReaderWriter rw;
     Reader(ReaderWriter rw){
                 this.rw=rw;
       }
       public void run(){
          rw.startRead();
          rw.endRead();
}
}
class Writer implements Runnable{
     ReaderWriter rw;
     Writer(ReaderWriter rw){
                 this.rw=rw;
       }
       public void run(){
          rw.startWrite();
          rw.endWrite();
}
}
public class Rw{
   public static void main(String args[]){
      ReaderWriter rw=new ReaderWriter();
      Thread[] readers=new Thread[5];
      for(int i=0;i<readers.length;i++){
           readers[i]=new Thread(new Reader(rw));
           readers[i].start();
}
Thread[] writers=new Thread[5];
      for(int i=0;i<writers.length;i++){
           writers[i]=new Thread(new Writer(rw));
           writers[i].start();
  }
}
}