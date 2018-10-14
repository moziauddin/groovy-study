package au.com.moziauddin
import au.com.moziauddin.Employee
Employee emp = new Employee()
emp.idNum = "E1000"
emp.name = "Mohammad"
emp.eMail = "myemail@zoho.net"
println emp

Employee emp1 = new Employee(idNum: "E10009",name: "Charlie",eMail: "charlie@churn.net")
println emp1

Employee emp2 = new Employee()
emp2.setIdNum("E287838")
emp2.name = "John"
emp2.seteMail("tes@gmail.com")
println emp2