package lenovo.example.com.myjdapp.activity;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * Created by 15218 on 2017/11/16.
 */
public interface PostFile_Interface  {

    @Multipart
    @POST("upload")
    Call<postfile> getpostfile(@Query("uid") String uid,
                               @Part MultipartBody.Part fiel);

}
