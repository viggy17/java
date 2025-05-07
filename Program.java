public class Program{

    public void run(){

        System.out.println("in run - program");
    }

    public void fun(){

        System.out.println("in fun- program");
    }

    public static void main(String[] args){

        Program obj = new Program();
        obj.fun();
        obj.run();
    }
}

