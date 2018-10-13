println "-------- If ----------"
if(true) {
    println "Hoorray"
}
println "-------- If single line ----------"
if(true) println "Also true" //Not geerally used
println "-------- If with number ----------"
def rank = 90
if(rank < 100) {
    println "Still alive"
}
println "-------- If Else ----------"
def price = 25
if(price < 20) {
    println "Cheap"
} else {
    println 'Pricey one'
}
println "-------- If Else If ----------"
def age = 40
if(age < 5) {
    println "Child"
} else if(age >= 5 && age < 13) {
    println "Boy"
} else if(age >= 13 && age < 20) {
    println "Teen"
} else {
    println "Man"
}

println "-------- Terinary Op ----------"
def city = "MONTE BLANC"
def cityNull = (city != null) ? city : 'New York'
println cityNull
def elvisCity = city ?: 'defult message'
println elvisCity
def whatCity = (city.toUpperCase() == 'MONTE BLANC') ? 'YES' : 'NO'
println whatCity
println "-------- Switch case ----------"
def number = 23
switch(number) {
    case 1..10:
        println "1 to 10"
        break
    case [23,24,25]:
        println "number is in list 22, 23, 24"
        break
    case String:
        println "Is a string"
        break
    default:
        println "3"
}

println "-------- If ----------"


println "-------- If ----------"