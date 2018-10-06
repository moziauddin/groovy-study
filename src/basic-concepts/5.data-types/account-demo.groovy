@groovy.transform.ToString
// Account demo assignment
class Account {
    BigDecimal balance = 0
    String type
    
    void deposit(BigDecimal dep) {
        this.balance = this.balance + dep
    }
    
    void withdraw(BigDecimal wdl) {
        this.balance = this.balance - wdl
    }
    
    BigDecimal plus(Account other) {
        this.balance + other.balance
    }
}

Account checking = new Account(type:"Checking")
checking.deposit(100.00)
println "Checking Account Balance = " + checking.balance
Account savings = new Account(type:"Savings")
savings.deposit(50.00)
println "Savings Account Balance = " + savings.balance

BigDecimal total = checking + savings
println "Total Balance = " + total