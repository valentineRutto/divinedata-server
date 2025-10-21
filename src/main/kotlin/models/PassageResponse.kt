package models

data class PassageResponse(
    val canonical: String,
    val parsed: List<List<Int>>,
    val passage_meta: List<PassageMeta>,
    val passages: List<String>,
    val query: String
)