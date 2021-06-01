package com.tedm.marvelapp.repository

import com.tedm.marvelapp.data.remote.CharactersApi
import com.tedm.marvelapp.data.remote.responses.CharactersList
import com.tedm.marvelapp.other.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class CharactersRepository @Inject constructor(
    private val api: CharactersApi
){
    suspend fun getCharactersList(limit: Int, offset: Int): Resource<CharactersList> {
        val response = try {
            api.getCharactersList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred.")
        }
        return Resource.Success(response)
    }

    suspend fun getCharacterInfo(characterId: Int): Resource<Character> {
        val response = try {
            api.getCharacterInfo(characterId)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred.")
        }
        return Resource.Success(response)
    }

}