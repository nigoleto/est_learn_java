package ormi0617;

public class ProfileService {
    ProfileRepository profileRepository;

    public void saveProfile(){
        profileRepository = new ProfileDBRepository();
        profileRepository.save();
    }
}
