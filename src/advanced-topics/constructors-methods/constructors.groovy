println "------------ Creating a class ------------"
@groovy.transform.ToString
class Person {
    String first,last
    // constructor
    Person(String fullName) {
        List nameParts = fullName.split(' ')
        println nameParts
        first = nameParts[0]
        last = nameParts[1]
    }
    
    // methods
    def foo() {
        println "Values: $first $last"
    }
    public static String groovyGood() {
        println "Groovy is good"
    }
    static String passDefaultList(List nums = [1,2,3], Boolean status = false) {
        
    }
    def joinString(String... args) { // prints number of args
        println args.length
    }
}
// Default Constructor
//Person p = new Person(first: "Mo",last: "Zee")
//println p
Person p1 = new Person("John Doe")
println p1
p1.foo()
Person.groovyGood()
p1.groovyGood()
p1.joinString('q','dfs','sdgfhsdhse','sdfds')

/*
Output:
------------ Creating a class ------------
[John, Doe]
Person(John, Doe)
Values: John Doe
Groovy is good
Groovy is good
4


*/