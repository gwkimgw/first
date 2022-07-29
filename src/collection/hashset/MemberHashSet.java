package collection.hashset;

import collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> iterator = hashSet.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();
            int tmp = member.getMemberid();
            if (memberId == tmp) {
                hashSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "does not exist");
        return false;
    }

    public void showAll() {
        for(Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println(hashSet);
    }
}
