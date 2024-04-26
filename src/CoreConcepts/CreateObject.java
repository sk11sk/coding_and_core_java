package CoreConcepts;

public class CreateObject implements  Cloneable{
    int x =10;
    public static void main(String[] args)  {

        //way 1


        CreateObject obj1 = new CreateObject();
        System.out.println(obj1.x);

        //way 2 ==> implemnt Cloneable




        try {
            CreateObject  obj2 = (CreateObject) obj1.clone();
            System.out.println(obj2.x);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        // way 3 ===> using reflection
        try {
            CreateObject obj3 = CreateObject.class.newInstance();
            System.out.println(obj3.x);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
