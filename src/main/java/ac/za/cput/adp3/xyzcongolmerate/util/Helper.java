package ac.za.cput.adp3.xyzcongolmerate.util;
import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix)  {

        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);

        String suffixId = "";


        for(int x = 0; x < className.length(); x++){
            if(Character.isUpperCase(className.charAt(x))){
                char character = className.charAt(x);
               suffixId = suffixId + character + "";
            }
        }
        return suffixId.replaceAll("\\r+","");



    }
}
