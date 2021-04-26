package id.ac.umn.week11_28280;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    APIInterface mAPIInterface;
    private RecyclerView mRecyclerView;
    private PostsAdapter postsAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.rvJSON);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAPIInterface = APIClient.getClient().create(APIInterface.class);

        get();
    }

    public void get() {
        Call<List<Posts>> postsCall = mAPIInterface.getPosts();
        postsCall.enqueue(new Callback<List<Posts>>() {
            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
                List<Posts> postsList = response.body();
                Log.d("Retrofit Get", "Jumlah data posts: " + String.valueOf(postsList.size()));
                postsAdapter = new PostsAdapter(postsList);
                mRecyclerView.setAdapter(postsAdapter);
            }

            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }
}