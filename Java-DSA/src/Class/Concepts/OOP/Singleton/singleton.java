package Class.Concepts.OOP.Singleton;
// singleton class is something that its object is created only once
public class singleton {
    // private constructor so only class can use this
    private singleton(){
    }
    // created object in class static as we have to access it in getInstance which is static
    private static singleton instance;

    // getInstance is accessed by other class and here we are not creating object so, we keep this function static
    // As we know static is object independent so here we create only one instance, and it is same for all objects
    public static singleton getInstance(){
        // this allows only one object to be created if not null return the same
        if(instance == null){
            instance = new singleton();
        }
        return instance;
    }

}
