package com.trilochan.darazassign_5.ClassInterface;

import com.trilochan.darazassign_5.ClassModel.ProductCollectionModal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    // url
    @GET("simant_daraz_product_api.php")
    Call<ProductCollectionModal> parseProduct();
}
