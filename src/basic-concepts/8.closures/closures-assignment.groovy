println "------------ Method accepting Closure ------------"
def acceptArg(Closure c) {
    println "Hello"
    c()
}

def myMethod = {
    println "myMethod"
}
acceptArg(myMethod)
println "------------ Print a list ------------"
def myList = ["Aus","Syd","Mel","Can"]
myList.each( {
    println it
    }
)
 
println "------------ Some Text ------------"
println "------------ Approach 1 ------------"
Map myMap = [name:"mo", num:"10", boss:"zee", add:"11 Mon St, Chaplin WA"]
myMap.each { map1 ->
    println map1
}
println "------------ Approach 2 ------------"
myMap.each { k,v ->
    println "$k = $v"
}

println "------------ Curry another Closure ------------"
def greet = { String x, String y ->
    println "$x $y"
}
greet("Good","Day")

def sayGN = greet.curry("Good")
sayGN("Night")


/*
Output:

------------ Method accepting Closure ------------
Hello
myMethod
------------ Print a list ------------
Aus
Syd
Mel
Can
------------ Some Text ------------
------------ Approach 1 ------------
name=mo
num=10
boss=zee
add=11 Mon St, Chaplin WA
------------ Approach 2 ------------
name = mo
num = 10
boss = zee
add = 11 Mon St, Chaplin WA
------------ Curry another Closure ------------
Good Day
Good Night

*/