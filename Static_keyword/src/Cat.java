// The static keyword indicates that a member (ie, variable, method, nested class or block) BELONGS TO THE CLASS ITSELF, rather than an instance of a class


// the variables name, age and method meow are non static (ie, they belong to the instance of a class or individual objects)
// thats also logically correct right? a particular cat can have a name(ie, kitty) but not the class itself
// where are static variable(or fields) used ? it is used when there is a common field for all the objects like catCounter
// catCounter does not depend on individual cats right? (then it would be meaningless)
// rather it is static method, ie, increments when objects of cat class are created
// another way static fields are used is in creating CONSTANTS
// like MAX_life_Span (ie, all cats have a max life span of 9 years) this is shared commonly by all the objects of the class
public class Cat {
// non static fields

String name;
int age;

//non static method
void meow(){
    System.out.println("Meow!!");
}

//static field
public final int Max_Life_Span = 9;
// it is final as once assigned value, it can never change

// static method

private static int  catCount = 0 ;

// getter method for catCount

int getCatCount(){
   return catCount;
}

// constructor
Cat(){
    catCount++;
}

void printCat(){
    System.out.println("cat name : " + name + " cat age : " + age + "  current Cat count : " + catCount );
}

}


// we can't reference or call non static methods or fields from a static method or field
// but we can call the static method from a non static method or field (this is not followed and gives you an error)