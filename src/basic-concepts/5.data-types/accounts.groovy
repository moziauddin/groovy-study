// a and b are both objects of java.lang.Integer
// null value will be returned if you write the "plus" method as void
class Account {
    BigDecimal balance

    Account plus(Account other) {
        new Account(balance: this.balance + other.balance)
    }
    
    String toString(){
        "Account Balance: $balance"
    }
}

Account savings = new Account(balance:100.00)
Account check = new Account(balance:500.00)

println savings
println check
println savings + check
