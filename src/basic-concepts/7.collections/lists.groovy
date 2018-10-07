def num = []
println num.getClass().getName()
println num

def num1 = [1,2,4,6,99] as LinkedList
println num1.getClass().getName()
println num1

//adding to the list
num.push(99)
num.putAt(3,11)
num[6] = 32
println num
println num + [7,3,44]
println num // list is unchanged
num << 98

println num
//removing from the list
num.pop()
println num
num.removeAt(0)
println num
println num - 32
println num
// get from list
println num[4]
println num.getAt(5)
println num.getAt(1..2)
// clear or delete contents the list
println num.clear()
num = []
println num



// loop though list
println "---------- Loop through list ----------"
def num2 = [99, 11, null, null, 32, 7, 3, 44]
for(x in num2) {
    println x
}

// flatten list

def num3 = [2,43,5,22,66,45,73,54]
num3 << [4,77,96,34,66,73]
println num3
num3 << [34,65,21,77,47]
print "Lists in a List: "println num3
num3 = num3.flatten()
print "Flatten List: "println num3
// unique
print "Only unique entries: " println num3.unique()


// sets
def num4 = [1,1,10,3,5,45,3,76,34,8,34,76,342,84,36,58,98,34] as Set
print "Set : "print num4
print " Type is: " + num4.class.name
