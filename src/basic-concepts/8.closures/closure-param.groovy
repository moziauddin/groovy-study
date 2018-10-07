// implicit param 
println "-------- Implicit Param -------"
def foo = {
    println it
}
foo("Mo")

println "-------- No Params ---------"
def noParams1 = {
    println "no params"
}
noParams1()
// This will throw exception. Uncomment below block
/*
def noParams2 = { ->
    println "no params"
}

println noParams2(10)
*/

println "---- Multiple parameters -----"
def sayHello = { String first, String last ->
    println "Hello $first, $last"
}
sayHello("Mo","Zee")
println "-------- Default Values -------"
def greet = { String name, String greeting = "Howdy" ->
    println "$greeting $name"
}
greet("Mo","Morning")
greet("Joe")
println "---------- var arg ------------"
def joinStrings = { String... args ->
    args.join('')
}
println joinStrings('abc','fgh','hgf')
println joinStrings('mo', ' ', 'ziauddin')
println "--------- some method ---------"
def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}
def someClosure = { int x, int y -> x + y}
someMethod(someClosure)