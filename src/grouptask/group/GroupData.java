package grouptask.group;

import grouptask.status.Status;

import java.util.Objects;

public final class GroupData {
    private int groupId;
    private Status status;

    public GroupData(int groupId, Status status) {
        this.groupId = groupId;
        this.status = status;
    }

    public int getGroupId() {
        return groupId;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData that = (GroupData) o;
        return status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        return "status=" + status ;
    }
}
