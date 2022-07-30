package collection.treeset;

import collection.Member;

public class MemberTreeTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member1 = new Member(101, "good");
        Member member2 = new Member(102, "good2");
        Member member3 = new Member(103, "good3");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);

        memberTreeSet.showAll();
    }
}
