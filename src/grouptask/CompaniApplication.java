package grouptask;

import grouptask.group.Group;
import grouptask.repository.GroupRepository;
import grouptask.status.Status;

public class CompaniApplication {
    public static void main(String[] args) {
        Group group1 = new Group("group1", new Status[]{Status.A, Status.B});
        Group group2 = new Group("group2", new Status[]{Status.D, Status.H});
        Group group3 = new Group("group3", new Status[]{Status.D, Status.L});
        Group group4 = new Group("group4", new Status[]{Status.J, Status.G});
        GroupRepository company = new GroupRepository();
        company.add(null, group1);
        company.add(group1,group2);
        company.add(group2, group3);
      //  company.delete(group2.getId());
        company.add(group3, group4);

        System.out.println(company);
    }
}
