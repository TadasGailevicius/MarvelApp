package com.tedm.marvelapp.di

import com.tedm.marvelapp.data.remote.CharactersApi
import com.tedm.marvelapp.other.Constants.BASE_URL
import com.tedm.marvelapp.repository.CharactersRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideCharactersRepository(
        api: CharactersApi
    ) = CharactersRepository(api)

    @Singleton
    @Provides
    fun provideCharactersApi(): CharactersApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(CharactersApi::class.java)
    }
}