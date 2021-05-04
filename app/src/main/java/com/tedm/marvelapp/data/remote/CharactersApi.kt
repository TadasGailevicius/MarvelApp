package com.tedm.marvelapp.data.remote

import com.tedm.marvelapp.data.remote.responses.CharactersList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharactersApi {

    @GET("characters")
    suspend fun getCharactersList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): CharactersList

    @GET("characters/{characterId}")
    suspend fun getCharacterInfo(
        @Path("characterId") characterId: Int
    ): Character
}