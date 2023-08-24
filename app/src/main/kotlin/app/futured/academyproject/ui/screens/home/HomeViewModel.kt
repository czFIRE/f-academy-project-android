package app.futured.academyproject.ui.screens.home

import app.futured.academyproject.domain.GetPlacesFlowUseCase
import app.futured.academyproject.tools.arch.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.collections.immutable.toPersistentList
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    override val viewState: HomeViewState,
    private val getPlacesFlowUseCase: GetPlacesFlowUseCase,
) : BaseViewModel<HomeViewState>(), Home.Actions {

    init {
        loadCulturalPlaces()
    }

    private fun loadCulturalPlaces() {
        viewState.error = null

        getPlacesFlowUseCase.execute {
            onNext {
                Timber.d("Cultural places: $it")

                viewState.places = it.toPersistentList()
            }
            onError { error ->
                Timber.e(error)
                viewState.error = error
            }
        }
    }

    override fun tryAgain() {
        loadCulturalPlaces()
    }

    override fun navigateToDetailScreen(placeId: Int) {
        sendEvent(NavigateToDetailEvent(placeId))
    }
}