@groovy.transform.ToString()
class Developer {
    String First
    String Last
    def Languages = []
    
    void work() {
        println "${First} ${Last} is working!"
    }
}