class Dna(val dnaString: String) {
    private val components = setOf('A', 'C', 'G', 'T')

    init {
        require(dnaString.all { it in components })
    }

    val nucleotideCounts: Map<Char, Int>
        get() {
            return components.associateWith { comp ->
                dnaString.count { it == comp }
            }
        }
}
