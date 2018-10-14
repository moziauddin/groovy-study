package au.com.moziauddin

class EmployeeBean {

    // private vars
    String empNum
    String name
    String email
    String title

    //no args constructor
    public EmployeeBean() {

    }

    //getters and setters
    String getEmpNum() {
        return empNum
    }

    String getName() {
        return name
    }

    String getEmail() {
        return email
    }

    String getTitle() {
        return title
    }

    void setEmpNum(String empNum) {
        this.empNum = empNum
    }

    void setName(String name) {
        this.name = name
    }

    void setEmail(String email) {
        this.email = email
    }

    void setTitle(String title) {
        this.title = title
    }
}
