package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {


    @Test
    public void buildOrganisationUser() {
        String orgUser = "XYZ1234";
        String userEmail = "xyzphil@outlook.com";
        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser(orgUser,userEmail);
        Assert.assertNotNull(organisationUser.getOrgCode());
        System.out.println(organisationUser.toString());
    }
}