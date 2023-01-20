package com.kodilla.notification.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NotificationSendingTestSuite {

    NotificationSending notificationSending = new NotificationSending();
    Notification notification = Mockito.mock(Notification.class);
    Removal removal = Mockito.mock(Removal.class);
    Person person = Mockito.mock(Person.class);
    Person secondPerson = Mockito.mock(Person.class);
    Person thirdPerson = Mockito.mock(Person.class);
    Localisation localisation = Mockito.mock(Localisation.class);
    Localisation secondLocalisation = Mockito.mock(Localisation.class);

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
        for(Person currentPerson : person1) {
            notificationSending.addPerson(currentPerson);
        }
    }
}