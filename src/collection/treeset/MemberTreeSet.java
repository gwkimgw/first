package collection.treeset;

import collection.Member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet{
    private TreeSet<Member> treeset;

    public MemberTreeSet() {
        treeset = new TreeSet<Member>(new Member());
    }

    public void addMember(Member member) {
        treeset.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> iterator = treeset.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();
            int tmp = member.getMemberid();
            if (memberId == tmp) {
                treeset.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "does not exist");
        return false;
    }

    public void showAll() {
        for(Member member : treeset) {
            System.out.println(member);
        }
    }
}
