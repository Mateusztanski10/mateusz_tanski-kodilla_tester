package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistsGroupUsernames = filterChemistsGroupUsernames();
        System.out.println(chemistsGroupUsernames);

        List<String> ageMoreThan30 = usersOlderThan(30);
        System.out.println(ageMoreThan30);

        List<String> moreThan13Letters = userNamesWithMoreThan13Letters(13);
        System.out.println(moreThan13Letters);

        List<String> securityGroupUsernames = filterSecurityGroupUsernames();
        System.out.println(securityGroupUsernames);
    }

    static List<String> filterChemistsGroupUsernames() {
         return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    static List<String> usersOlderThan(int age) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user1 -> user1.getAge() > age)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
    }

    static List<String> userNamesWithMoreThan13Letters(int letters) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user2 -> user2.getUsername().length() > letters)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
    }

    static List<String> filterSecurityGroupUsernames() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user3 -> user3.getGroup().equals("Security"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
    }
}
