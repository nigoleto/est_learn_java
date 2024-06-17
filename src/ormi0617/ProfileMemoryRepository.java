package ormi0617;

public class ProfileMemoryRepository implements ProfileRepository {
    @Override
    public void save() {
    System.out.println("메모리에 프로필이 저장되었습니다.");
    }
}
