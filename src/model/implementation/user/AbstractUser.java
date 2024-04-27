package model.implementation.user;

public class AbstractUser implements User {

    private String userName;

    public AbstractUser(String userName) {
        setUserName(userName);
    }

    private void setUserName(String userName) {
        checkUsername(userName);
        this.userName = userName;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    private void checkUsername(String userName) {
        if (userName == null || userName.isEmpty() || userName.contains(" ")) {
            throw new IllegalArgumentException("Invalid user name.");
        }
    }
}
