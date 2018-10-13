//Create An Account Class
//Create two methods with same name to pass a deposit amount and catch exceptions
// Use try catch blocks to handle the exception

class Account {
    BigDecimal balance = 0
    
    def deposit(BigDecimal amount) {
        if(amount < 0) {
            throw new Exception("NegativeAmountException")
        }
        balance += amount
    }
    def deposit(List amounts) {
        for(amount in amounts) {
            deposit(amount)
        }
    }
}
Account savings = new Account()
savings.deposit(11)
println "Account Balance = " + savings.balance
try {
    savings.deposit(-2)
    println "Account Balance = " + savings.balance
} catch(Exception e) {
    println e.message + ": Amount to deposit cannot be negative"
}

/*
Output:
Account Balance = 11
NegativeAmountException: Amount to deposit cannot be negative


*/