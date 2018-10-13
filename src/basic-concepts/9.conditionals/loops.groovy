println "-------- Ways to print loop ----------"
List num = [1,2,3]
println num
num.each( {println it} )
println "-------- While ----------"
while(num) {
    num.remove(0)
}
println num

println "-------- For Loop ----------"
def list = [3,4,6,7,8,6]
for(nums in list) {
    println nums
}

for(i in 1..5) {
    println i
}
println "-----------break/continue-----"
for(String s in 'a'..'z'){
    if(s == 'a'){
        println s
        continue
    } else if(s == 'd') {
        println 'breaking'
        println s
        break
    } else {
        println 'no match'
    }

}
/*
Output:
-------- Ways to print loop ----------
[1, 2, 3]
1
2
3
-------- While ----------
[]
-------- For Loop ----------
3
4
6
7
8
6
1
2
3
4
5
-----------break/continue-----
a
no match
no match
breaking
d

*/


