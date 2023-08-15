@file:Suppress("UnusedPrivateMember")

package app.futured.academyproject.data.remote

import android.content.Context
import app.futured.academyproject.data.model.api.CulturalPlaces
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.serialization.json.Json
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApiManager @Inject constructor(
    @ApplicationContext context: Context,
    json: Json,
    private val apiService: ApiService,
): ApiExecutor(context, json) {

    // TODO Krok 2:
    //  Zavolaj implementovanú metódu z ApiService a správne spracuj response. Mysli na spracovanie erroru a v prípade chyby vráť
    //  ApiExceptionUnknown. Ako bonus môžeš skúsiť spracovať rôzne typy errorov. Pre inšpiráciu sa pozri na triedu ApiException
    suspend fun getCulturalPlaces(): CulturalPlaces = executeApiCall { apiService.getCulturalPlaces() }

    //suspend fun getCulturalPlaces_v2(): CulturalPlaces = apiervi
}
