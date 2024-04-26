package AbstrctClass_n_Interface_when_to_use;

public abstract  class A {
  String name ;
    A(String name){

    this.name  = name;

        System.out.println(name);

    }
    abstract void  test();


    public void test1 (){
        System.out.println("this is the complete non static  method  of the abstract class A");
    }

    public static  void test2(){

        System.out.println("this is the static complete method  of the abstract class A");
    }

    public static void main(String[] args) {

      A.test2();

    }
}
