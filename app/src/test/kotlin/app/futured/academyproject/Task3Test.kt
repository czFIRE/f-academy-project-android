package app.futured.academyproject

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.junit.Test
import kotlin.random.Random

class Task3Test {

    @Test
    fun santaAndGoblins() {
        /**
         * Santa ma na starosti 10 skritku
         * Kazdy skritek vykonava nejakou praci od 100 ms po 1 s
         * Santa by mel pockat az skritci dokonci svoji praci a potom teprve muze ukoncit svoji
         */

        // couroutine

        val scope = CoroutineScope(Dispatchers.IO);

        scope.launch {
            for (x in 1..10) {
                goblin(Random.nextLong())
            }

            // wait for all?
        };

        assert(true);
    }

    suspend fun goblin(workTime: Long) {
        delay(workTime);
    }
}
