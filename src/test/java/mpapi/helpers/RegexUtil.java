package mpapi.helpers;

import java.util.regex.Pattern;

public final class RegexUtil {

    public static final Pattern NOT_DIGIT = Pattern.compile("\\D+");
    public static final Pattern DIGIT = Pattern.compile("\\d+");
    public static final Pattern NOT_MONEY = Pattern.compile("[^\\d,.]+");
    public static final Pattern DOT = Pattern.compile("\\.");
    public static final Pattern COMMA = Pattern.compile(",");
    public static final Pattern SINGLE_WHITESPACE = Pattern.compile("\\s");
    public static final Pattern PRODUCT_CONTENT_ID = Pattern.compile("(?<=p-)(\\d+)");
    public static final Pattern DASH = Pattern.compile("-");
    public static final Pattern DASH_DASH = Pattern.compile("--");
    public static final Pattern SLASH = Pattern.compile("/");
    public static final Pattern LAST_PRODUCT = Pattern.compile("\\(Son [\\d] ürün\\)");
    public static final Pattern TL = Pattern.compile("TL");
    public static final Pattern PIPE = Pattern.compile(" \\| ");
    public static final Pattern DOT_JAVA = Pattern.compile(".java");
    public static final Pattern BOUTIQUE_ID = Pattern.compile("boutiqueId=");
    public static final Pattern PI = Pattern.compile("pi=");
    public static final Pattern PLUS = Pattern.compile("\\+");
    public static final Pattern MERCHANT_ID = Pattern.compile("(?<=merchantId=)(\\d+)");
    public static final Pattern PRODUCT_NAME_IN_URL = Pattern.compile("(?<=(.com\\/.{0,20}\\/))(.*)(?=\\-p\\-)");
    public static final Pattern PHONE = Pattern.compile("(\\d{2})(\\d{3})(\\d{2})(\\d+)");
    public static final Pattern PHONE2 = Pattern.compile("(\\d{3})(\\d{5})(\\d{2})");
    public static final Pattern BOUTIQUE_ID_FULL = Pattern.compile("boutiqueId=\\d+");
    public static final Pattern MERCHANT_ID_FULL = Pattern.compile("merchantId=\\d+");
    public static final Pattern REVIEW_STAR_COUNT = Pattern.compile("(?<=width: )\\d*(?=%;)");
    public static final Pattern TESLIMAT = Pattern.compile("teslimat:");
    public static final Pattern TR_I = Pattern.compile("İ");
    public static final Pattern PARANTHESES = Pattern.compile("[\\(\\)]");
    public static final Pattern NEW_LINE = Pattern.compile("\n");

    private RegexUtil() {
    }
}
