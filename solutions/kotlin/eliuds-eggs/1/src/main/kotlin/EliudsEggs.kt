object EliudsEggs {

    fun eggCount(number: Int): Int {
        val binary = Integer.toBinaryString(number).padStart(7, '0')
        return binary.count { it == '1' }
    }
}
