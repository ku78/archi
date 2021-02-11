package com.hw6;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserDataMapper mapper = new UserDataMapperImpl();
        User user = new User(1, "Pavel", "Admin");
        mapper.insert(user);
        Optional<User> userToBeFound = mapper.find(user.getUserId());
        user = new User(user.getUserId(), "Ivan", "User");
        mapper.update(user);
        mapper.delete(user);
    }
}
