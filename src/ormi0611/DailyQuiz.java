package ormi0611;

public class DailyQuiz {

    public static void main(String[] args){

        Person me = new Person("나");
        Friend friend1 = new Friend("친구1");
        Friend friend2 = new Friend("친구2");
        Friend friend3 = new Friend("친구3");
        Friend friend4 = new Friend("친구4");

        me.party();
        me.party(friend1);
        me.party(friend1, friend2);
        me.party(friend1, friend2, friend3, friend4);
    }
}
