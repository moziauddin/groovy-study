// Create a new instance of developer class
Developer d = new Developer()
d.First = "Mo"
d.setLast("Ziauddin")

d

// set languages
// d.languages.getClass().getName() - Get type of the class
// d.languages.class - Get type of the class (short)
d.languages << "Groovy"
d.languages << "Ruby"

d
// call the method
d.work()