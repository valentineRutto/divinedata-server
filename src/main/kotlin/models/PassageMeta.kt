package models

data class PassageMeta(
    val canonical: String,
    val chapter_end: List<Int>,
    val chapter_start: List<Int>,
    val next_chapter: List<Int>,
    val next_verse: Int,
    val prev_chapter: List<Int>,
    val prev_verse: Int
)