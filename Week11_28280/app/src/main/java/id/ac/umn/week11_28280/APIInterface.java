package id.ac.umn.week11_28280;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("posts")
    Call<List<Posts>> getPosts();
}
