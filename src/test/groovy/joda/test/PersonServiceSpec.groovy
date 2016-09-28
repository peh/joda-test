package joda.test

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import grails.test.mixin.hibernate.HibernateTestMixin
import grails.util.Mixin
import spock.lang.Specification

@TestFor(PersonService)
@Mock([Person])
@Mixin([HibernateTestMixin])
class PersonServiceSpec extends Specification {

    void "This should work"() {
        given:
        Person person = new Person(name: 'test').save(flush: true)
        when:
        Person test = service.findPerson()

        then:
        test.name == person.name

    }
}
