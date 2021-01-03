package akakom.ricoadityaherlambang.datafrominternetmedium.api

import android.provider.ContactsContract
import akakom.ricoadityaherlambang.datafrominternetmedium.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>
}