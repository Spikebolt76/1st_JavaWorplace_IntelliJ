/*
An abstract class is a class that:
-------------------------------------
    Cannot be instantiated (i.e., you cannot create an object of an abstract class).
    Can contain abstract methods (methods without implementation).
    Can also contain non-abstract (concrete) methods (methods with implementation).
    Can have constructors, fields (variables), and properties.
    Is used when multiple related classes share some common behavior, but specific details differ.

    => Even though an abstract class cannot be instantiated, it can have a constructor to initialize its fields.

    # Use an abstract class when:
        You need a base class with shared functionality.
        You want to enforce common behavior across subclasses while still allowing them to define their own specific implementations.
        You need to include non-abstract methods in the base class.

    - Abstract methods must be implemented by subclasses.
    - It is useful for code reusability and enforcing common behavior.

    --> Abstract methods cannot be static because static methods belong to the class itself,
        whereas abstract methods are meant to be overridden by subclasses.

     ## IMP ::: A subclass can be abstract even if its superclass is concrete.

     => You cannot create an instance from an abstract class using the new operator, but an abstract class can be used as a datatype.
        Therefore, the following statement, which creates an array whose elements are of the GeometricObject type, is correct.
                GeometricObject[] objects = new GeometricObject[10];

        You can then create an instance of GeometricObject and assign its reference to the array like this:
                objects[0] = new Circle();

[pg 500, Liang pdf]
======================================================================================================
 */

public abstract class GeometricObject {

}
