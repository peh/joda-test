package joda.test

import grails.converters.JSON
import org.joda.time.DateTime

class PersonController {

    def index() {
        new Person(name: "test+${System.currentTimeMillis()}").save(flush: true)
        render (Person.findAllByDateCreatedLessThan(DateTime.now().plusDays(1)) as JSON)
    }
}
