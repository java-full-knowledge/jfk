package com.jfk.geometric;

import com.jfk.inheritance.Employee;

public class GroupApplication {

    public static void main(String[] args) {

        Group base =
                new Group(10,
                        new Group(20,
                                new Group(2,
                                        new Group(34))));

        int count = calculateGroupUsersCountIterative(base);
        int countRecursive = calculateGroupUsersCountRecursive(base);
        System.out.println("ALL USERS : " + countRecursive);
    }

    static int calculateGroupUsersCountIterative(Group base) {
        if (base == null) {
            System.out.println("Group is null");
            return -1;
        }
        int allUserCount = 0;
        while (base.getSubGroup() != null) {
            allUserCount = allUserCount + base.getUserCount();
            base = base.getSubGroup();
        }
        return allUserCount + base.getUserCount();
    }

    static int calculateGroupUsersCountRecursive(Group base) {
        if (base != null) {
            return base.getUserCount() + calculateGroupUsersCountRecursive(base.getSubGroup());
        }
        return 0;
    }
}
