package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

        public static double averageNumberOfPostsFromUsersWithMoreOrEqualsThan40Years() {
            return UsersRepository.getUsersList()
                    .stream()
                    .filter(user -> user.getAge() >= 40)
                    .mapToInt(user -> user.getNumberOfPost())
                    .average()
                    .getAsDouble();
        }

        public static double averageNumberOfPostsFromUsersWithLessThan40Years() {
            return UsersRepository.getUsersList()
                    .stream()
                    .filter(user -> user.getAge() < 40)
                    .mapToInt(user -> user.getNumberOfPost())
                    .average()
                    .getAsDouble();
        }

    public static void main(String[] args) {
        averageNumberOfPostsFromUsersWithMoreOrEqualsThan40Years();
        averageNumberOfPostsFromUsersWithLessThan40Years();
    }
}

