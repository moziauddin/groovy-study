def c = { }
println c
println c.class.name
println c.getClass().getName()
println c instanceof Closure

def sayHello = { name ->
    println "Hi There, $name"
}

sayHello("Mo")

List nums = [1,2,3,4,6,7,9]
println "------------ Printing Nums with it ------------"
nums.each({
    println it
})
println "--------- Printing Nums passing nums -----------"
nums.each({ num ->
    println num
})

println "------------ TimesTen ------------"
def timesTen(num,closure) {
    closure(num * 10)
}

timesTen(10,{println it})
timesTen(2) {
    println it
}
println "------------ Ten.Times ------------"
10.times {
    println it
}
println "------------ Random nums ------------"
import java.util.Random
Random rand = new Random()
3.times {
    println rand.nextInt()
}

/*
Output:
closures$_run_closure1@1901d1db
closures$_run_closure1
closures$_run_closure1
true
Hi There, Mo
------------ Printing Nums with it ------------
1
2
3
4
6
7
9
--------- Printing Nums passing nums -----------
1
2
3
4
6
7
9
------------ TimesTen ------------
100
20
------------ Ten.Times ------------
0
1
2
3
4
5
6
7
8
9
------------ Random nums ------------
1040830692
-1509465422
614844552

*/