import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class iex {

    public static void main (String args[]) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.iextrading.com/ew")
                .get()
                .addHeader("Content-Type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "a06d2a01-9a5b-4664-8a54-f69bb665865e")
                .build();

        Response response = client.newCall(request).execute();

        System.out.println(response.body().string());
    }
}
