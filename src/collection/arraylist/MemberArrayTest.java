package collection.arraylist;

import collection.Member;

public class MemberArrayTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(101, "good");
        Member member2 = new Member(102, "good2");
        Member member3 = new Member(103, "good3");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);
        memberArrayList.showAll();

        memberArrayList.removeMember(member1.getMemberid());
        memberArrayList.showAll();
    }
}
