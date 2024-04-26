package Core_Concepts.reflection;

import java.lang.reflect.Constructor;








class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class ReflectionApi {
    public static void main(String[] args) throws Exception {
        // Accessing the Singleton instance using normal way
        Singleton normalInstance = Singleton.getInstance();
        System.out.println("Normal instance: " + normalInstance);

//        Singleton s2=Singleton.getInstance();
//        System.out.println(s2);

        // Accessing the Singleton instance using Reflection
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singleton reflectedInstance = constructor.newInstance();
        System.out.println("Reflected instance: " + reflectedInstance);
    }
}






