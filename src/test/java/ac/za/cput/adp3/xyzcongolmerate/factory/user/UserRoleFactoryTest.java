package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {


    @Test
    public void buildUserRole() {
        UserRole userRole = UserRoleFactory.buildUserRole("org2468", "philranti@gmail.com", "user200");
        Assert.assertNotNull(userRole);
        System.out.println(userRole.toString());
    }
}