package ormi0619;

import java.util.Objects;

public class Member {
    String name;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Member) {
            Member member = (Member)o;
            return member.name.equals(this.name) && member.age == this.age;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
