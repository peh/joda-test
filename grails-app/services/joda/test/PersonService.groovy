package joda.test

import grails.transaction.Transactional
import org.joda.time.DateTime

@Transactional
class PersonService {

    def findPerson() {
        Person.findByDateCreatedLessThan(DateTime.now().plusDays(1))
    }
}
