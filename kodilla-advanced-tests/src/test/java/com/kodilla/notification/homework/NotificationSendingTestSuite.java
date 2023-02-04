package com.kodilla.notification.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NotificationSendingTestSuite {

    NotificationSending notificationSending;
    Notification notification;
    Removal removal;
    Person person;
    Person secondPerson;
    Person thirdPerson;
    Localisation localisation;
    Localisation secondLocalisation;

    @BeforeAll
    public void setUp() {
        notificationSending = new NotificationSending();
        notification = Mockito.mock(Notification.class);
        removal = Mockito.mock(Removal.class);
        person = Mockito.mock(Person.class);
        secondPerson = Mockito.mock(Person.class);
        thirdPerson = Mockito.mock(Person.class);
        localisation = Mockito.mock(Localisation.class);
        secondLocalisation = Mockito.mock(Localisation.class);
    }



    @Test
    public void interestedPersonCanBeAddedToProperLocalisationAndWillStartReceiveNotification() {
        notificationSending.addPerson(person);
        notificationSending.sendNotification(notification);

        Mockito.verify(person, Mockito.times(1)).receive(notification);
    }

    @Test
    public void deleteSubscriptionFromLocalisation() {
        notificationSending.addPerson(person);
        notificationSending.deletePerson(person);
        notificationSending.sendNotification(notification);

        Mockito.verify(person, Mockito.never()).receive(notification);
    }

    @Test
    public void subscriptionCanBeRecallFromAllLocalisationsAndClientWillBeTotallyWriteOutFromNotification() {
        notificationSending.addLocalisation(localisation);
        notificationSending.addPerson(person);
        notificationSending.deletePerson(person);
        notificationSending.addLocalisation(secondLocalisation);
        notificationSending.addPerson(person);
        notificationSending.deletePerson(person);
        notificationSending.sendNotification(notification);

        Mockito.verify(person, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationToPeopleFromLocalisationShouldAppearOnlyToKnownSample() {
        notificationSending.addPerson(person);
        notificationSending.addPerson(secondPerson);
        notificationSending.sendNotification(notification);

        Mockito.verify(person).receive(notification);
        Mockito.verify(secondPerson).receive(notification);
        Mockito.verify(thirdPerson, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationCanBeSendToAllPeople() {
        addPerson(person, secondPerson, thirdPerson);
        notificationSending.sendNotification(notification);
        Mockito.verify(person).receive(notification);
        Mockito.verify(secondPerson).receive(notification);
        Mockito.verify(thirdPerson).receive(notification);
    }

    @Test
    public void givenLocalisationCanBeDeleted() {
        notificationSending.addLocalisation(localisation);
        notificationSending.deleteLocalisation(localisation);
        notificationSending.sendRemoval(removal);

        Mockito.verify(localisation, Mockito.never()).receive(removal);
    }

    private void addPerson(Person... person1) {
        for (Person currentPerson : person1) {
            notificationSending.addPerson(currentPerson);
        }
    }
}