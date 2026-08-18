import java.math.BigInteger
import kotlin.math.pow

object Board {

    // g_n = 2^(n-1)
    fun getGrainCountForSquare(number: Int): BigInteger {
        if (number !in 1..64) {
            throw IllegalArgumentException()
        }

        return BigInteger.TWO.pow(number - 1)
    }

    // S_n = 2^(n-1)
    fun getTotalGrainCount(): BigInteger {
        return BigInteger.TWO.pow(64) - BigInteger.ONE
    }
}
