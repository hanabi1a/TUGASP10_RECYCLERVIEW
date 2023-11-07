package com.example.tugasp11_recyclerview

data class Hero (
    val nameHero: String = "",
    val descHero: String = "",
    val julukan: String = "",
    val imageResourceId: Int
)

//Data class dengan nama Hero.
// Memiliki empat properti:
//nameHero: Nama pahlawan.
//descHero: Deskripsi atau keterangan tentang pahlawan.
//julukan: Julukan atau alias pahlawan.
//imageResourceId: ID gambar yang terkait dengan pahlawan.

//Data class Hero yang didefinisikan, dalam konteks RecyclerView, berguna untuk merepresentasikan item-item yang akan ditampilkan.
// RecyclerView memerlukan adapter untuk menghubungkan data dengan tampilan yang akan ditampilkan di dalamnya,
// data class Hero ini digunakan sebagai model data yang diatur oleh adapter.
