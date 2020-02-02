package grouptask.repository;

public interface Repository<Group> {

    public Group delete(int groupid);

    public Group add(Group parentGroup, Group group);

    public Group get(int groupid);


}
