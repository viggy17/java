public class Program1{
      
      public void run(){

         System.out.println("in run-parent");

      }

      public  void fun(){
        System.out.println("in fun-parent");
      }
          

    
}



 class Program2 extends Program1{

   Program2(String str){

          System.out.println(str);
   }
   
   public static void main(String[] args){
      
       Program2 obj = new Program2("hello");
       obj.run();
       obj.fun();

   }

}