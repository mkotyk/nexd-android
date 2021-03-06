package app.nexd.android.api;

import app.nexd.android.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import app.nexd.android.api.model.Article;
import app.nexd.android.api.model.CreateArticleDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ArticlesApi {
  /**
   * List articles
   * 
   * @return Observable&lt;List&lt;Article&gt;&gt;
   */
  @GET("articles")
  Observable<List<Article>> articlesControllerFindAll();
    

  /**
   * Create an article
   * 
   * @param xAdminSecret Secret to access the admin functions. (required)
   * @param createArticleDto  (required)
   * @return Observable&lt;Article&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("articles")
  Observable<Article> articlesControllerInsertOne(
    @retrofit2.http.Header("x-admin-secret") String xAdminSecret, @retrofit2.http.Body CreateArticleDto createArticleDto
  );

}
