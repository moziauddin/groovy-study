// testing out the customer class

def d = new Date()
def c1 = new Customer(first:'John', last:'Doe', age:33, since:d, favItems:['Books', 'Games'])
def c2 = new Customer('John', 'Doe', 33, d, ['Books', 'Games'])
assert c1 == c2

c1.first = 'Mike'
