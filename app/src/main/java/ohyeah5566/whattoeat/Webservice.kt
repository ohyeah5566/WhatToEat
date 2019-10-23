package ohyeah5566.whattoeat

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Webservice {
    @GET("/todos/{id}")
    fun getTodo(@Path(value = "id") todoId: Int): Call<Todo>
}