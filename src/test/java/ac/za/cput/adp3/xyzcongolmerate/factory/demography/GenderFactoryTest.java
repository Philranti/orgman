package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {


    @Test
    public void buildGender() {
        String gen = "Female";
        Gender gender = GenderFactory.buildGender(gen);
        Assert.assertNotNull(gender.getGenderId());
        System.out.println(gender.toString());
    }
}