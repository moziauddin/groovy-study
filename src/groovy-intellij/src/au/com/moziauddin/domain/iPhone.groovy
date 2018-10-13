package au.com.moziauddin.domain
@groovy.transform.ToString()
class IPhone extends Phone {
    String iosVersoin = 12
    def powerButtonPress() {
        println "Pressed Power Button"
    }

    @Override
    def ring() {
        println "Phone is ringing with tone: iPhone Default Tone"
    }

}
