package grouptask.repository;

import grouptask.group.Group;
import grouptask.group.GroupData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class GroupRepository implements Repository<Group> {
    private List<Group> groupsofCompany;

    public GroupRepository(List<Group> groupsofCompany) {
        this.groupsofCompany = groupsofCompany;
    }

    public GroupRepository() {
        this.groupsofCompany = new ArrayList<>();
    }

    @Override
    public Group delete(int groupid) {
        if (this.get(groupid) == null) {
            System.out.println("Parent group not found!!!");
            return null;
        }
        Group group = this.get(groupid);
        groupsofCompany.remove(group);
        Iterator<Group> iterator = groupsofCompany.iterator();
        while (iterator.hasNext()) {
            Group group1 = iterator.next();
            GroupData[] arr1 = new GroupData[0];
            arr1 = (GroupData[]) group.getStatus().toArray(arr1);
            GroupData[] arr2 =  new GroupData[0];
            arr2 = (GroupData[]) group1.getStatus().toArray(arr2);
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i].equals(arr2[j]) && arr1[i].getGroupId()==group.getId())
                        group1.getStatus().remove(arr2[j]);
                }
            }
        }
        return group;

    }

    @Override
    public Group add(Group parentGroup, Group abstractGroup) {
        if (parentGroup == null) {
            if (!groupsofCompany.isEmpty()) {
                System.out.println("Parent group not found!!!");
                return null;
            }
            groupsofCompany.add(abstractGroup);
            return abstractGroup;
        }
        abstractGroup.addAll(parentGroup.getStatus());
        groupsofCompany.add(abstractGroup);
        return abstractGroup;

    }

    public Group get(int groupid) {
        Iterator<Group> iterator = groupsofCompany.iterator();
        while (iterator.hasNext()) {
            Group abstractGroup = iterator.next();
            if (abstractGroup.getId() == groupid)
                return abstractGroup;
        }
        return null;
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < groupsofCompany.size(); i++) {
            temp +="{"+ groupsofCompany.get(i);
            temp += "}\n";
        }
        return temp;
    }
}
