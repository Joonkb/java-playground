package nextstep.optional;

import java.util.Arrays;
import java.util.List;

public class Users {
    static final User DEFAULT_USER = new User("codesquad", 100);

    // null을 넣게되면 Error가 발생하게 됨.
    List<User> users = Arrays.asList(
            new User("crong", 35),
            new User("pobi", 30),
            new User("jk", 40),
            new User("honux", 45));


    User getUser(String name) {
        return users.stream()
                .filter(user -> name.equals(user.getName()))
                .findAny().orElse(DEFAULT_USER);
    }
}
