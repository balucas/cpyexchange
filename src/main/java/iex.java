import com.google.gson.Gson;
import com.google.gson.JsonObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class iex {

    public static void main (String args[]) throws IOException {

        JsonObject test = IEXData.getEarnings("aapl");

        String a = test.get("earnings").toString();

        System.out.println(a);

    }
}
