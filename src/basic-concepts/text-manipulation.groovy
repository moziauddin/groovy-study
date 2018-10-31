groovy:000> def bits = ['It','is','the','(','right',')','thing']
===> [It, is, the, (, right, ), thing]
groovy:000> plintln bits
No signature of method: groovysh_evaluate.plintln() is applicable for argument types: (java.util.ArrayList) values: [[It, is, the, (, right, ), thing]]
Possible solutions: println(), println(), println(java.lang.Object), println(java.lang.Object), println(java.io.PrintWriter), print(java.lang.Object)
groovy:000> println bits
[It, is, the, (, right, ), thing]
===> null
groovy:000> println bits.class.name
java.util.ArrayList
===> null
groovy:000> println bits.getClass().getName()
java.util.ArrayList
===> null
groovy:000> println bits instanceof Arranlist
script15409627630871796977857.groovy: 1: unable to resolve class Arranlist 
 @ line 1, column 25.
   println bits instanceof Arranlist
                           ^

groovy:000> println bits instanceof ArrayList
true
===> null
groovy:000> def sayHello = { bits -> }
===> groovysh_evaluate$_run_closure1@39655d3e
groovy:000> def sayHello = { bits -> println bits }
===> groovysh_evaluate$_run_closure1@7b94089b
groovy:000> sayHello(bits)
[It, is, the, (, right, ), thing]
===> null
groovy:000> bits.each( { println it } ) 
It
is
the
(
right
)
thing
===> [It, is, the, (, right, ), thing]
groovy:000> bits.join({it}.join(' '))
No signature of method: groovysh_evaluate.join() is applicable for argument types: (java.lang.String) values: [ ]
Possible solutions: main([Ljava.lang.String;), wait(), run(), run(), find(), wait(long)
groovy:000> def join(bits) {bits.findAll {it}.join(' ') }
===> true
groovy:000> bits
===> [It, is, the, (, right, ), thing]
groovy:000> bits.findAll
Exception evaluating property 'findAll' for java.util.ArrayList, Reason: groovy.lang.MissingPropertyException: No such property: findAll for class: java.lang.String
groovy:000> bits.findAll {it }
===> [It, is, the, (, right, ), thing]
groovy:000> def join(bits) { bits.findAll {it}.join(' ')}
===> true
groovy:000> join(bits)
===> It is the ( right ) thing
groovy:000> :show variables 
Variables:
  groovysh_collected_boundvars = [:]
  _ = It is the ( right ) thing
  bits = [It, is, the, (, right, ), thing]
  sayHello = groovysh_evaluate$_run_closure1@7b94089b
  join = method join()
===> [groovysh_collected_boundvars:[:], _:It is the ( right ) thing, bits:[It, is, the, (, right, ), thing], sayHello:groovysh_evaluate$_run_closure1@7b94089b, join:org.codehaus.groovy.runtime.MethodClosure@4a194c39]
