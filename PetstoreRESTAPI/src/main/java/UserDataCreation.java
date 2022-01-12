import com.github.javafaker.Faker;

public class UserDataCreation {
	public static UserPOJO user = new UserPOJO();
    public static Faker randomValue = new Faker();

    public UserPOJO NewUserData()
    {
        user.setId(randomValue.number().randomDigitNotZero());
        user.setUsername(randomValue.name().username());
        user.setFirstName(randomValue.name().firstName());
        user.setLastName(randomValue.name().lastName());
        user.setEmail(randomValue.internet().emailAddress());
        user.setPassword(randomValue.internet().password());
        user.setPhone(randomValue.phoneNumber().phoneNumber());
        user.setUserStatus("1");
        return user;
    }
}
