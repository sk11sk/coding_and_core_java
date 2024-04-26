package CoreConcepts;

public class static_non_static {
}

 class Student  {
    //static and non static variable
    public String name ;
    public int age ;

    public  static String   college = "RGPV";

    public void show (){

        System.out.println( name +" : "+ age + " " + college  );

    }

    public static void main(String[] args) {


        Student student = new Student();
        student.name = "shuarabh";
        student.age = 28;
        Student.college = " RGTU ";

        Student student1 = new Student();
        student1.name = "shubham";
        student1.age = 27;
        Student.college = " BIST ";


        student.show();
        student1.show();

// static variable is shared among all the objects , make a field static which is same for every field in  this case it is college
       // so that we dont have to initialise it in each object

//        System.out.println(student.name + "  " + student.age+" "+college );
//        System.out.println(student1.name + "  " + student1.age+" "+college );


    }



}