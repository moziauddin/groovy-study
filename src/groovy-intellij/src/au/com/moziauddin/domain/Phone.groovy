package au.com.moziauddin.domain
//import java.util.Calendar
class Phone {
    String name
    String os
    String appStore

    def powerOn() {
        def date = new Date()
        println "Powering ON at : " + date
    }

    def powerOff() {
        def date = new Date()
        prinln "Powering OFF at : " + date
    }

    def ring() {
        println "Phone is ringing with tone: Symphony Mozart"
    }

}
