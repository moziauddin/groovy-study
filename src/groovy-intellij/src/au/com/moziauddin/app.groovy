package au.com.moziauddin

import au.com.moziauddin.domain.IPhone

IPhone phone = new IPhone(name:"iPhone",os:"ios",appStore: "Apple Store")
println phone.iosVersoin
phone.powerButtonPress()
phone.powerOn()
phone.ring()