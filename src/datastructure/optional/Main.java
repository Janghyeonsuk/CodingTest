package datastructure.optional;

import datastructure.collection.User;

public class Main {
    public static void main(String[] args) {
        User user = User.EMPTY;

        User user2 = getUser();
        if(user2 == User.EMPTY) {

        }

        System.out.println(user);
    }

    private static User getUser() {
        return User.EMPTY;
    }
}
