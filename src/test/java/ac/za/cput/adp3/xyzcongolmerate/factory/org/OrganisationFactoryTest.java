package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {


    @Test
    public void buildOrganisation() {
        String org = "XYZ Congolmerate";
        Organisation organisation = OrganisationFactory.buildOrganisation(org);
        Assert.assertNotNull(organisation.getOrgCode());
        System.out.println(organisation.toString());
    }
}