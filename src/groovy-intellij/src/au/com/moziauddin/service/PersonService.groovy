package au.com.moziauddin.service

import au.com.moziauddin.domain.Person

class PersonService implements IPersonService{

    @Override
    Person findAll() {
        Person p = new Person(first:"Mo",last:"Zee")
        return p
    }

//    @Override
//    List<Person> findAll() {
//        Person p1 = new Person(first:"Peewee",last:"Herman")
//        Person p2 = new Person(first:"Jenine",last:"Herman")
//        [p1,p2]
//    }
}
