import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    @Test
   public void verifySAPhoneNumber() {
        Validation v = new Validation();
        v.validateSAPhoneNumber("^((?:\\+27|27)|0)(\\d{2})-?(\\d{3})-?(\\d{4})$");
        Pattern pattern = Pattern.compile("^((?:\\+27|27)|0)(\\d{2})-?(\\d{3})-?(\\d{4})$");
        Matcher matcher = pattern.matcher("+27783031285");
        assertTrue(matcher.matches());

    }
}