package prototype;

// This is the prototype interface, it is the contract that all prototypes must implement.
public interface Prototype {

    // This method is a main part of the prototype pattern, it is used to create a new instance of the object by cloning the current object.
    Prototype clone();

}
