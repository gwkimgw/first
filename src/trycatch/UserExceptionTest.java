package trycatch;

public class UserExceptionTest {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws UserException{
        if(userID == null) {
            throw new UserException("null!");
        }
        else if(userID.length() < 8 || userID.length() > 20){
            throw new UserException("length not matched!");
        }
        this.userID = userID;
    }

    public static void main(String[] args) {
        UserExceptionTest userExceptionTest = new UserExceptionTest();
        String userId = null;
        try {
            userExceptionTest.setUserID(userId);
        } catch (UserException e) {
            System.out.println(e);
        }

        userId = "1234567";
        try {
            userExceptionTest.setUserID(userId);
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }
    }
}