package ormi0617;

public class ProfileDBRepository implements ProfileRepository {

    @Override
    public void save() {
    System.out.println("DB에 프로필이 저장되었습니다.");
    }
}
