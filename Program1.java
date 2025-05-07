public class Program1{
      
      public void run(){

         System.out.println("in run-parent");

      }

      public static void fun(){
        System.out.println("in fun-parent");
      }
          
}

public class Program1 extends Program2{

   Program2(String str){

          System.out.println(str);
   }
   
   public static void main(String[] args){
      
       Program2 obj = new Program2("hello");
       obj.run();
       obj.fun();

   }

}