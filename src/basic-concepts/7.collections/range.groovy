for(int i=4; i>0;i--) {
    print i
}

for(j=0; j<10; j++) {
    print j
}

//arrays
def letters = ['a','b','c','d']
for(int i=0;i < letters.size();++i) {
    println letters[i]
}

// Groovy ranges demo
Range r = (1..<10)
println "-------------- Printing each ---------------"
r.each{println it}
println r.class.name
println r.from
println r.to

assert (0..10).contains(9) //works
//assert (0..9).contains(10) //fails

// text ranges
Date today = new Date()
Date oneWeek = today + 7

println today
println oneWeek
println "-------------- Printing each ---------------"
Range days = today..oneWeek
days.each{println it}

