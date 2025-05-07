public class Parent{

    public void run(){

        System.out.println("in run - parent");
    }

    public void fun(){

        System.out.println("in fun- parent");
    }

    public static void main(String[] args){

        Parent obj = new Parent();
        obj.fun();
        obj.run();
    }
}

