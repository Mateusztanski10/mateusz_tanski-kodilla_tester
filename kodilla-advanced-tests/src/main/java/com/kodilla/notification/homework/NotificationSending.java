package com.kodilla.notification.homework;

import java.util.HashSet;
import java.util.Set;

public class NotificationSending {

    private Set<Person> person = new HashSet<>();
    private Set<Localisation> localisation = new HashSet<>();

    public void sendNotification(Notification notification) {
        this.person.forEach(person -> person.receive(notification));
    }

    public void addPerson(Person person) {
        this.person.add(person);
    }

    public void deletePerson(Person person) {
        this.person.remove(person);
    }

    public void addLocalisation(Localisation localisation) {
        this.localisation.add(localisation);
    }

    public void deleteLocalisation(Localisation localisation) {
        this.localisation.remove(localisation);
    }

    public void sendRemoval(Removal removal) {
        this.localisation.forEach(localisation -> localisation.receive(removal));
    }
}
