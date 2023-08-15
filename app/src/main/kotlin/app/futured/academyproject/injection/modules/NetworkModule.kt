package app.futured.academyproject.injection.modules

import app.futured.academyproject.BuildConfig
import app.futured.academyproject.data.remote.ApiService
import app.futured.academyproject.tools.Constants.Api.BASE_PROD_URL
import app.futured.academyproject.tools.Constants.Api.TIMEOUT_IN_SECONDS
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import timber.log.Timber
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    // TODO Krok 3:
    //  Implementuj HttpLoggingInterceptor, ktory bude logovat requesty a response pre jednoduchšie debugovanie
    //  Nezabudni nastavit level na HttpLoggingInterceptor.Level.BODY a na logovanie využi Timber
    @Provides
    @Singleton
    fun provideLoggingInterceptor(): Interceptor = HttpLoggingInterceptor {
        message -> Timber.tag("OkHTTP").d(message)
    }.apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    /*{
        var httpLog = HttpLoggingInterceptor{message -> Timber.tag("OkHttp").d(message)}
        httpLog.level = HttpLoggingInterceptor.Level.BODY
        return httpLog;
    }*/

    // TODO Krok 4:
    //  Vytvor OkHttp clienta HttpLoggingInterceptor a pridaj k nemu logging interceptor
    @Provides
    @Singleton
    fun provideOkHttpClient(
        loggingInterceptor: Interceptor,
    ): OkHttpClient = OkHttpClient
        .Builder()
        .addInterceptor(loggingInterceptor)
        .build()

    // TODO Krok 5:
    //  Za pomoci Retrofitu vytvor ApiService, ktorý automaticky implementuje definíciu z ApiService na reálnu implementáciu.
    //  Nezabudni pridať OkHttpClient a converterFactory `json.asConverterFactory("application/json".toMediaType()`
    //  URL nájdeš v konštatnátch ako BASE_PROD_URL
    //  Odporúča sa nastaviť aj validateEagerly(BuildConfig.DEBUG)
    //  TODO("Channel your inner Jára Cimrman, inventor of Android and Kotlin")
    @Provides
    @Singleton
    fun provideRetrofitService(
        okHttpClient: OkHttpClient,
        json: Json,
    ): ApiService = Retrofit.Builder()
        .baseUrl(BASE_PROD_URL)
        .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
        .client(okHttpClient)
        .validateEagerly(BuildConfig.DEBUG)
        .build()
        .create(ApiService::class.java)
}
