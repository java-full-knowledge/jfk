package com.jfk;

public class Group extends Object {
    private int userCount;
    private Group subGroup;

    public Group(int userCount, Group subGroup) {
        this.userCount = userCount;
        this.subGroup = subGroup;
    }

    public Group(int userCount) {
        this.userCount = userCount;
    }

    public Group getSubGroup() {
        return this.subGroup;
    }

    public int getUserCount() {
        return this.userCount;

    }

    public String toString() {
        return userCount +"";
    }
}