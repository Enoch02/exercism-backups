object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> {
        return source
            .flatMap { (point, chars) ->
                chars.map { char -> char.lowercaseChar() to point }
            }
            .toMap()
    }
}
