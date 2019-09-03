package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.text.*;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {


    @Test
    public void buildUserDemography(){


        Calendar cal = new GregorianCalendar(1994, 07, 19);


        UserDemography userDemography = UserDemographyFactory.buildUserDemography("xyz.phil@outlook.com",
                "Mr", "GF","Black",cal.getTime());
        Assert.assertNotNull(userDemography);
        System.out.println(userDemography.toString());
    }
}