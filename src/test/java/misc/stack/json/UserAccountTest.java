package misc.stack.json;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserAccountTest {

    @Test
    public void testSerializeDeserializeUsingJackson() throws Exception {
        final ObjectMapper mapper = new ObjectMapper();

        final UserAccount acct = new UserAccount("Bob",
                BigDecimal.valueOf(10.0));
        Assert.assertNotNull(acct.getMoney());
        final String json = mapper.writeValueAsString(acct);
        System.out.println(json);

        final UserAccount deser = mapper.readValue(json, UserAccount.class);
        System.out.println(deser);
        Assert.assertNull(deser.getMoney());
    }
}
