class Triangle<out T : Number>(val a: T, val b: T, val c: T) {
    val da = a.toDouble()
    val db = b.toDouble()
    val dc = c.toDouble()

    init {
        require(da > 0 && db > 0 && dc > 0)
        require(da + db >= dc && da + dc >= db && db + dc >= da)
    }

    val isEquilateral: Boolean = da == db && db == dc
    val isIsosceles: Boolean = da == db || da == dc || db == dc
    val isScalene: Boolean = da != db && da != dc && db != dc
}
