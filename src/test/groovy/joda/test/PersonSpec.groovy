package joda.test

import grails.test.mixin.TestFor
import grails.test.mixin.hibernate.HibernateTestMixin
import grails.util.Mixin
import org.joda.time.DateTime
import spock.lang.Specification

@TestFor(Person)
@Mixin([HibernateTestMixin])
class PersonSpec extends Specification {

    void "This should work too"() {
        given:
        Person person = new Person(name: 'test').save(flush: true)
        when:
        Person test = Person.findByDateCreatedLessThan(DateTime.now().plusDays(1))

        then:
        test.name == person.name

    }
}
