package mpapi.helpers;

import com.google.gson.Gson;

import java.security.SecureRandom;

public class DataHelper {
    private static Gson gson;

    static {
        gson = new Gson();
    }
    public static String object2Json(Object object) {
        try {
            return gson.toJson(object);
            // return ow.writeValueAsString(object);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
