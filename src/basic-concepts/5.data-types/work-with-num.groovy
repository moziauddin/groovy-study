// GDK methods
// All the below evaluate to true
assert 2 == 2.5.toInteger() // conversion
assert 2 == 2.5 as Integer // enforced coercion
assert 2 == (int) 2.5 //cast

// times - upto - downto - step

5.times {
    println "*"
}

1.upto(3) { num ->
    println num
}

10.downto(5) { num ->
    println num
}

0.step(10,3) { num ->
    println num
}