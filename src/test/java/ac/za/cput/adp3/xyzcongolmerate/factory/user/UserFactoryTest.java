package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {


    @Test
    public void buildUser() {
        String gen = "Female";
        User user = UserFactory.buildUser("xyz.phil", "Phillip", "Mphela");
        Assert.assertNotNull(user);
        System.out.println(user.toString());
    }
}