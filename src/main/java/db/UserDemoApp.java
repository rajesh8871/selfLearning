package db;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserDemoApp {

    public static void main(String[] args) {


        List<User> usersKnowsDriving = new ArrayList<>();
        usersKnowsDriving.add(new User("rajesh", "BZXPB2245M", "28-02-1996"));
        usersKnowsDriving.add(new User("MUKESH", "BZXPB2246M", "28-02-1996"));
        usersKnowsDriving.add(new User("RAHUL", "BZXPB2247M", "28-02-1996"));
        usersKnowsDriving.add(new User("RAKESH", "BZXPB2248M", "28-02-1996"));
        usersKnowsDriving.add(new User("raj", "BZXPB2249M", "28-02-1996"));

        List<User> usersDrivingLeftHanded = new ArrayList<>();
        usersDrivingLeftHanded.add(new User("rajesh", "BZXPB2245M", "28-02-1996"));
        usersDrivingLeftHanded.add(new User("MUKESH", "BZXPB2246M", "28-02-1996"));


        List<User> rightHandedDriver = usersKnowsDriving;

        System.out.println(rightHandedDriver);
    }
}
