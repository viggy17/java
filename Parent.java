public class Parent{
      
      public void run(){

         System.out.println("in run-parent");

      }

      public  void fun(){
        System.out.println("in fun-parent");
      }
          

    
}



 class Child extends Parent{

   Child(String str){

          System.out.println(str);
   }
   
   public static void main(String[] args){
      
       Child obj = new Child("hello");
       obj.run();
       obj.fun();

   }

}