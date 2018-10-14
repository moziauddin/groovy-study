package au.com.moziauddin

import groovy.transform.ToString

@ToString
class Employee implements Serializable {
    String idNum
    String name
    String eMail

}
