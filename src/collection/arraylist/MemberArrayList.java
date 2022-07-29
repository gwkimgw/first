package collection.arraylist;

import collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
//        for(int i=0; i<arrayList.size(); i++) {
//            Member member = arrayList.get(i);
//        int tmp = member.getMemberid();
//            if (memberId == tmp) {
//                arrayList.remove(i);
//                return true;
//            }
//        }
        Iterator<Member> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();
            int tmp = member.getMemberid();
            if (memberId == tmp) {
                arrayList.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "does not exist");
        return false;
    }

    public void showAll() {
        for(Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println(arrayList);
    }
}
