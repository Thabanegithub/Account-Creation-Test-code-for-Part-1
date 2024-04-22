
package accountcreation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class AccountCreationTest {
    //assertEquals test
    @Test
    public void testUsernameCorrectlyFormatted(){
        String userName = "Mpho_";
        String expectedOutput = "Welcome Mpho Thabane, it is great to see you again.";
        assertEquals(expectedOutput, formatUsername(userName));
    }
    
    @Test
    public void testUsernameIncorrectlyFormatted(){
        String username = "Mpho!!";
        String expectedOutcome = "Username is incorrectly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length";
        assertEquals(expectedOutcome, formatUsername(username));
    }
    //assertTrue/False
    @Test
    public void testPasswordMeetsComplexity(){
        String passWord = "Qu3st!on";
        
        assertTrue(checkPasswordComplexity (passWord));
    }
    
    @Test
    public void testPasswordDoesNotMeetComplexity(){
        String password = "password2";
        
        assertFalse(checkPasswordComplexity (password));
    }
    
    @Test
    public void testLoginSuccessful(){
        String userName = "Mpho_";
        String passWord = "Qu3st!on";
        
        assertTrue(login(userName,passWord));
    }
    
    @Test
    public void testLoginFailed(){
        String username = "Mpho!!";
        String password = "password2";
        
        assertFalse(login(username,password));
    }
    
    //implement these methods for the conditions above
    private String formatUsername(String userName){
    return "True";
    }
    
    private boolean checkPasswordComplexity(String password){
    return false;
    }
    
    private boolean login(String username, String password){
    return false;
    }
}
