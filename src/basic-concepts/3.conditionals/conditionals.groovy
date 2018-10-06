// if
println "-------------- Simple if ---------------------"
if(true)
  println "condition is true"
  
if(!false)
  println "value is false"

if(!null)
  println "value is null"
  
//if else
def x = 10
println "-------------- if ... else ---------------------"
if(x == 11) {
    println "x is 10"
} else {
    println "x is not 10"
}

// while
println "-------------- while loop ---------------------"
def i = 1
while(i <= 3) {
    println i
    i++
}

// for in list
def list = [1,2,3,4,5]
println "-------------- for in list ---------------------"
for(num in list) {
    println num
}

// closure
println "-------------- Closure ---------------------"
def list2 = [1,2,3,4,5]
list2.each {println it}

// switch
println "-------------- Switch ---------------------"
def mynum = 1
switch(mynum) {
    case 1:
        println "number is 1"
        break
    default:
        println "default case printed..."
}
