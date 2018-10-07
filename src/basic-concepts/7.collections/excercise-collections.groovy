// Create and enum with days in it
enum myDays {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}
println myDays.values()

// RANGES
// Create a range from that enum
//Range myDaysRange = myDays.values() -- Doesn't work
Range myDaysRange = myDays.Sunday..myDays.Saturday
println myDaysRange
// print all days in the range
myDaysRange.each{println it}

// Print the size of the Range
println "Number of items in range: " + myDaysRange.size()

// Use the contains method to see if Wednesday is in that Range
println myDaysRange.contains(myDays.Sunday)
println "Print the FROM element of this range : " + myDaysRange.from
println "Print the TO element of this range : " + myDaysRange.to

// LISTS
// Create a list days (Sun - Sat)
def dayList = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
println dayList.getClass().getName()

// Print out the list
println "List contains: " + dayList
// Print the size of the list
println "Size: " + dayList.size()
// Remove Saturday from the list
dayList.removeAt(6)
println dayList
// Add Saturday back by appending it to the list
dayList = dayList << 'Saturday'
println dayList

// Print out the Wednesday using its index
println dayList[3]

// Create a map of days of the week - 1: Sunday, 2:Monday, etc...
def dayMap = [1:"Sun",2:"Mon",3:"Tue",4:"Wed",5:"Thu",6:"Fri",7:"Sat"]
// Print out the map
println dayMap
// Print out the class name of the map
println dayMap.getClass().getName()
// Print the size of the map
println dayMap.size()
// Is there a method that would easily print out all of the days (values)? 
println dayMap.values()
dayMap.each{v -> println "${v}"}