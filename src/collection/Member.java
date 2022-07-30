package collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {
    private int memberid;
    private String memberName;

    public Member() {};

    public Member(int memberid, String memberName) {
        this.memberid = memberid;
        this.memberName = memberName;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + "\'s id is " + memberid;
    }

    @Override
    public int hashCode() {
        return memberid;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            if(this.memberid == member.memberid) {
                return true;
            } else { return false; }
        }
        return false;
    }

    @Override
    public int compare(Member o1, Member o2) {
        return (o2.memberid - o1.memberid);
    }

    @Override
    public int compareTo(Member member) {
        return (this.memberid - member.memberid);
    }
}
