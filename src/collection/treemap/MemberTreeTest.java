package collection.treemap;

import collection.Member;

public class MemberTreeTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member member2 = new Member(102, "good2");
        Member member1 = new Member(101, "good");
        Member member3 = new Member(103, "good3");

        memberTreeMap.addMember(member1);
        memberTreeMap.addMember(member2);
        memberTreeMap.addMember(member3);
        memberTreeMap.showAll();

        memberTreeMap.removeMember(102);
        memberTreeMap.showAll();
    }
}
