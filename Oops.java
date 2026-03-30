//jav is oops explain in java
//oops is object oriented programming language  
//it is apporach based on class and object
//inheritance,encapsulation,polymorphism,abstraction are the main concept of oops
//access modifier are public,private,protected,default
//acscess modifier   in some class  in diffreenr package same package using object   in diffrenet class in same package using inheratance  in different class in different package using object  in different class in different package using inhertance
//public            yes                yes                                                          yes                                                      yes                                                                     yes
//protected         yes                yes                                                          yes                                                      no                                                                      yes
//default            yes                yes                                                         yes                                                       no                                                                      no
//private            yes                no                                                          mo                                                       no                                                                      no
// inheritance is a    paent to child  , super to sub    ,base to derived class
//
public class Oops {
    void type() {
        System.out.println("dog");
    }
}

class Animal extends Oops {
    void type() {
        System.out.println("cat");
    }
}
