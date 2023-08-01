package app.futured.academyproject.data

import kotlinx.coroutines.delay

class NetworkClient {

    suspend fun send(): Int {
        //TODO("upravit funkci, aby pockala 300ms a vratila 0")

        delay(300)
        return 0;
    }

    suspend fun sendAndReturnError() {
        //TODO("upravit funkci, aby pockala 300ms a vyhodila chybu")

        delay(300);
        throw Exception("This is an exception!");
    }
}
