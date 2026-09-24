val codons = mapOf(
    "AUG" to "Methionine",
    "UUU" to "Phenylalanine",
    "UUC" to "Phenylalanine",
    "UUA" to "Leucine",
    "UUG" to "Leucine",
    "UCU" to "Serine",
    "UCC" to "Serine",
    "UCA" to "Serine",
    "UCG" to "Serine",
    "UAU" to "Tyrosine",
    "UAC" to "Tyrosine",
    "UGU" to "Cysteine",
    "UGC" to "Cysteine",
    "UGG" to "Tryptophan",
    "UAA" to "STOP",
    "UAG" to "STOP",
    "UGA" to "STOP"
)

fun translate(rna: String?): List<String> {
    val result = mutableListOf<String>()

    if (rna.isNullOrBlank()) {
        return emptyList()
    }

    for (i in rna.indices step 3) {
        val codon = rna.substring(i, minOf(i + 3, rna.length))

        if (codons[codon] == "STOP") {
            break
        }

        val aminoAcid = codons[codon] ?: throw IllegalArgumentException()

        result.add(aminoAcid)
    }

    return result
}
