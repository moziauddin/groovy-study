def map = [:]
println map
println map.getClass().getName()
// println map.class.name --------- this will fail

def person = [first:"Mo",last:"Zia",email:"mozia@nowhere.com"]
println person
println person.first

person.twitter = "@therealmo"
println person
// gotchas
def bankDetails = [account:"311524524452",bsb:"789665",branch:"Newcastle"] //you cannot have space in key
println bankDetails
//to use a variable as key
def phonenum = "0411 334 567"
def contactDetails = [mobile: (phonenum)]
println contactDetails

// adding maps
def mo = person + contactDetails + bankDetails
println mo
for(key in mo.keySet()) {
    println "$key:${mo[key]}"
}