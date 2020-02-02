package grouptask.group;

import grouptask.status.Status;
import grouptask.generator.SequenceGenerator;

import java.util.HashSet;
import java.util.Set;

public final class Group{
    private final int Id;
    private String name;
    private Set<GroupData> statusSet;


    public Group(String name, Status[] statuses) {
        this.name = name;
        this.Id = SequenceGenerator.getNext();
        statusSet = new HashSet<>();
        for (Status status : statuses) {
            GroupData sg=new GroupData(Id,status);
            this.statusSet.add(sg);
        }

    }


    public int getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public Set<GroupData> getStatus() {
        return statusSet;
    }

    public void addAll(Set<GroupData> set) {
        this.statusSet.addAll(set);
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", statusSet=" + statusSet ;
    }
}
