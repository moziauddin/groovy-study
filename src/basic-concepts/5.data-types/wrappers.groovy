//checking classes for common data types
byte b = 10
b.getClass().getName()

short s = 10000
s.class

float f = 1.6
f.class

12833333333333.class

4.52.class

// def - wht the def
def x = 'C'
x.class

// Groovy Number Defaults
// --------------------------------------
def number1 = 10 // declared as decimal
def number2 = 5.5 // Changes type to BigDecimal
// explicit declaration
def myFloat = (float) 1.0
myFloat.class

// BigInt is more accurate compared to double data types
println 5.0d - 4.1d //WRONG
println 5-4.1

// Integer Division
println "--------------Integer Division ---------------"
def intDiv = 1/2
println intDiv
println intDiv.getClass().getName()
println 1.intdiv(2) //still supported using intdiv function
