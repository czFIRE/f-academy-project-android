package app.futured.academyproject.domain

import app.futured.academyproject.data.model.local.Place
import app.futured.academyproject.data.remote.ApiManager
import app.futured.arkitekt.crusecases.UseCase
import javax.inject.Inject

class GetCulturalPlacesUseCase @Inject constructor(
    private val apiManager: ApiManager,
) : UseCase<Unit, List<Place>>() {

    // TODO Krok 6:
    //  Implementuj metódu build, ktorá vráti zoznam miest.
    //  Využi ApiManager a namapuj CulturalPlaces na List<Place>.
    //  Mali by stačiť iba nasledujúce properties: id, longitude, latitude, name, type, note,
    override suspend fun build(args: Unit): List<Place> = apiManager.getCulturalPlaces().features.map {
        val value = it.properties;

        Place(
            id = value.ogcFid,
            longitude = it.geometry?.coordinates?.getOrNull(0),
            latitude = it.geometry?.coordinates?.getOrNull(0),
            name = value.name,
            type = value.type,
            note = value.note,
            image1Url = value.image1Url,
            webUrl = value.webUrl,
            program = value.program,
            street = value.street,
            streetNumber = value.streetNumber,
            email = value.email,
            phone = value.email,
            openFrom = value.openFrom,
            openTo = value.openTo
        )
    }
}
