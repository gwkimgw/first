package collection.hashset;

import collection.Member;

import java.util.HashSet;

public class MemberHashTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(101, "good");
        Member member2 = new Member(102, "good2");
        Member member3 = new Member(103, "good3");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);

        memberHashSet.showAll();

        Member member12 = new Member(101, "good");
        memberHashSet.addMember(member12);
        memberHashSet.showAll();
    }
}
