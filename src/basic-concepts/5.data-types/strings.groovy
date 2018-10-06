// Working with groovy string objects or types
// string interpolation
String name1 = 'Bob'
String message1 = "Hello ${name1}, How are you?"
String message2 = 'Hello ${name1}, How are you?' //dont use
println message1
println message2
// multiline strings
println "---------------- ML Strings ------------------"
def aLongMsg1 = """ hey
how
are
you ${name1}
???
"""
println aLongMsg1

def aLongMsg2 = ''' hey
how
are
you ${name1}
???
''' // Dont use this
println aLongMsg2

// Escape slashes using dollar
println "---------------- Escaping slashes ------------------"
def location1 = $/C:\some\folder/$
def location2 = $//home/mo/desktop/$
println "$location1 + $location2"