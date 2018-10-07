import java.util.regex.*;
def text = "Life in general is beautiful and precious if you do not give a crab about it"
def pattern = ~/beautiful and precious/
def finder = text =~ pattern
def matcher = text ==~ pattern

println finder
println finder.size() //returns number of matches
println matcher //we do not have an exact match

def text1 = "beautiful and precious"
def pattern1 = ~/beautiful and precious/
def finder1 = text1 =~ pattern1
def matcher1 = text1 ==~ pattern1

println finder1
println finder1.size() //returns number of matches
println matcher1 //we have an exact match

text = text.replaceFirst(pattern,"ugly and dumb")
println text
