package de.chefkoch.api.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import de.chefkoch.api.serialize.BooleanAsIntAdapter;
import de.chefkoch.api.serialize.IntegerAsStringAdapter;
import de.chefkoch.api.serialize.RuntimeTypeAdapterFactoryHelper;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by christophwidulle on 25.09.15.
 */
public class CkApiClient {


    private Retrofit retrofit;
    private RecipeApiModule recipeApiModule;
    private final Map<String, String> headers = new ConcurrentHashMap<>();

    public CkApiClient() {
        initWithBaseUrl("http://api.chefkoch.de/v2/");
    }

    private void initWithBaseUrl(String url) {

        final OkHttpClient client = new OkHttpClient();
        client.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {

                Request.Builder builder = chain.request().newBuilder();
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    builder.addHeader(entry.getKey(), entry.getValue());
                }
                return chain.proceed(builder.build());
            }
        });
        final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                .registerTypeAdapterFactory(RuntimeTypeAdapterFactoryHelper.getNotificationRuntimeTypeAdapterFactory())
                .registerTypeAdapter(Boolean.class, new BooleanAsIntAdapter()).registerTypeAdapter(Integer.class, new IntegerAsStringAdapter())
                .registerTypeAdapter(int.class, new IntegerAsStringAdapter())
                .create();

        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
        recipeApiModule = retrofit.create(RecipeApiModule.class);
    }

    public void updateBaseUrl(String url) {
        initWithBaseUrl(url);
    }

    public void addHeader(String key, String value) {
        this.headers.put(key, value);
    }

    public RecipeApiModule recipe() {
        return recipeApiModule;
    }
}
