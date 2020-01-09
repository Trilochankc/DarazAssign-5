package com.trilochan.darazassign_5.Classretrofit;


import com.trilochan.darazassign_5.ClassModel.CollectionModal;
import com.trilochan.darazassign_5.ClassModel.ProductModal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    // Node API for products
    @GET("daraz_products")
    Call<List<ProductModal>> getProduct();

    // Node API for collections
    @GET("daraz_collections")
    Call<List<CollectionModal>> getCollection();

}