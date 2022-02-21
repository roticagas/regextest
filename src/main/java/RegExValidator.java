import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExValidator {
    public static boolean isValidIp(String ipaddress) {
        String zeroto255 = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        String regexforip = zeroto255 + "\\." + zeroto255 + "\\." + zeroto255 + "\\." +zeroto255;
        Pattern p = Pattern.compile(regexforip);
        if(ipaddress == null)
            return false;
        Matcher m = p.matcher(ipaddress);
        return m.matches();
    }
    public static boolean isValidIp0(String ipaddress) {
        String zeroto255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\\\d|25[0-5])";
        String regexforip = zeroto255 + "\\." + zeroto255 + "\\." + zeroto255 + "\\." +zeroto255;
        Pattern p = Pattern.compile(regexforip);
        if(ipaddress == null)
            return false;
        Matcher m = p.matcher(ipaddress);
        return m.matches();
    }
}
