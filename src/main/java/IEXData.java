import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class IEXData{

    public static JsonObject getEarnings(String ticker) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.iextrading.com/1.0/stock/"+ ticker.toUpperCase() +"/earnings")
                .get()
                .addHeader("Content-Type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "a06d2a01-9a5b-4664-8a54-f69bb665865e")
                .build();

        Response response = client.newCall(request).execute();

        JsonParser parser = new JsonParser();

        JsonObject data = parser.parse(response.body().string()).getAsJsonObject();

        return data;

    }

    public static JsonObject getLast(String ticker) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.iextrading.com/1.0/tops/last?symbols=/" + ticker.toUpperCase())
                .get()
                .addHeader("Content-Type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "a06d2a01-9a5b-4664-8a54-f69bb665865e")
                .build();

        Response response = client.newCall(request).execute();

        JsonParser parser = new JsonParser();

        JsonObject data = parser.parse(response.body().string()).getAsJsonObject();

        return data;

    }


}
