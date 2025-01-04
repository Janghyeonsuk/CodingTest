package datastructure.optional;


import datastructure.collection.User;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {

        Optional<User> optionalUser = Optional.empty();
        optionalUser = Optional.of(new User(1, "2"));


        if (optionalUser.isPresent()) {
            /// do 1
        } else {
            //// do 2
        }

        if (optionalUser.isEmpty()) {
            // do 2
        } else {
            // do 1
        }

        optionalUser.ifPresentOrElse(user -> {
            // do 1
        }, () -> {
            // do 2
        });

        optionalUser.ifPresent(user -> {
            // do 1
        });
    }
}
