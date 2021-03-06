println "------------ Classes in Java ------------"
// Classes in Groovy are public in general, so no need to write that
public class Person {
    //some code
}

println "------------ Groovy Classes ------------"
class Person1 {
    String firstName, lastName
    def dob // private - protected - public
    protected String s1
    private Date created = new Date()
    
    static welcomeMsg = 'Hey There'
    public static final String WELCOME_MSG = 'Hello'
    
    //local variables to the method
    def testMethod() {
        String msg = "Morning"
        String firstName = "Mo"
        println "$msg, $firstName"
    }
}

println Person1.welcomeMsg
println Person1.WELCOME_MSG

def person1 = new Person1()
println person1.testMethod()


/*
Output:

------------ Classes in Java ------------
------------ Groovy Classes ------------
Hey There
Hello
Morning, Mo
null

*/