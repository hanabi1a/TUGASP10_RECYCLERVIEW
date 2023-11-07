package com.example.tugasp11_recyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugasp11_recyclerview.databinding.ActivityMainBinding

//MainActivity mengelola RecyclerView yang menampilkan daftar pahlawan dengan menggunakan HeroAdapter.
// Saat pengguna mengklik salah satu item pahlawan, pesan Toast akan muncul menampilkan julukan pahlawan yang diklik.

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterHero = HeroAdapter(generateDummy()) { hero ->
            Toast.makeText(this@MainActivity, "As known as ${hero.julukan}",
                Toast.LENGTH_SHORT).show()
        } //Sebuah instance dari HeroAdapter yang dibuat dengan menyediakan daftar pahlawan yang dihasilkan dari fungsi generateDummy().
        // Didalamnya tedapat fungsi yang akan dipanggil saat pengguna mengklik salah satu item di RecyclerView, maka sebuah pesan Toast akan ditampilkan dengan nama julukan pahlawan yang diklik.

        with(binding) {
            rvHero.apply {
                adapter = adapterHero
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        } //Melalui ekstensi fungsi with(binding), elemen-elemen UI yang ada dalam layout dapat diakses dengan lebih ringkas. Di sini, rvHero (RecyclerView) diatur dengan menggunakan adapter adapterHero dan
        // LinearLayoutManager sebagai tata letak manajernya.
    }

    private fun generateDummy(): List<Hero> {
        //generateDummy adalah fungsi yang mengembalikan daftar pahlawan. Setiap objek Hero dalam daftar mewakili satu pahlawan dengan informasi seperti nama, deskripsi, julukan, dan ID gambar.
        return listOf(
            Hero(
                nameHero = "Ir. Soekarno\n(June 6, 1901 - June 21, 1970)",
                descHero = "Ir. Soekarno was the proclaimer of independence and the first president of the Republic of Indonesia. He actively participated in Indonesia's struggle for independence against Dutch colonial rule, leading political and diplomatic efforts to support Indonesia's freedom on the international stage.",
                julukan = "Bapak Proklamasi Indonesia (The Father of Indonesian Proclamation)",
                imageResourceId = R.drawable.soekarno
            ),
            Hero(
                nameHero = "Mohammad Hatta\n(August 12, 1902 – March 14, 1980)",
                descHero = "Mohammad Hatta, along with Ir. Soekarno, proclaimed Indonesia's independence on August 17, 1945, marking the beginning of Indonesia's freedom from Dutch colonization. Hatta actively engaged in international diplomacy, advocating for the recognition of Indonesia's independence. Additionally, he played a role in national economic planning and contributed to the formation of Indonesia's economic foundations post-independence.",
                julukan = "Bapak Proklamasi Indonesia (The Father of Indonesian Proclamation)",
                imageResourceId = R.drawable.hatta
            ),
            Hero(
                nameHero = "Diponegoro\n(November 11, 1785 – January 8, 1855)",
                descHero = "Diponegoro led a major rebellion against Dutch rule in the early 19th century, known as the Diponegoro War (1825-1830), which stands as one of the most significant resistances against Dutch colonization. In 1830, Prince Diponegoro was captured through deceitful tactics by the Dutch, leading to his exile on Makassar Island, Sulawesi, where he lived until his death in 1855.",
                julukan = "Ksatria Piningit (The Hidden Knight)",
                imageResourceId = R.drawable.diponegoro
            ),
            Hero(
                nameHero = "R.A. Kartini\n(April 21, 1879 - September 17, 1904)",
                descHero = "Kartini pioneered the women's emancipation movement in early 20th-century Indonesia. She advocated for women's educational and freedom rights, challenging traditional limitations on women's roles. Establishing schools for girls, Kartini provided opportunities for women to gain knowledge, and her progressive thoughts on women's rights, education, and freedom were documented in the Letters of Kartini",
                julukan = "Pahlawan Emansipasi Wanita (Hero of Women's Emancipation)",
                imageResourceId = R.drawable.kartini
            ),
            Hero(
                nameHero = "Cut Nyak Dien\n(May 12, 1848 - November 6, 1908)",
                descHero = "Cut Nyak Dien was a national hero actively involved in resisting Dutch colonization in Aceh in the 19th century. She led Aceh forces in the war against the Dutch, known as the Aceh War. After her husband, Teuku Umar, died in battle, Cut Nyak Dien tenaciously continued the struggle. She was captured by the Dutch in 1901, and her children were exiled.",
                julukan = "Ibu Perbu dari Tanah Rencong (Mother of the Land of Rencong)",
                imageResourceId = R.drawable.cutnyakdien
            ),
            Hero(
                nameHero = "Ki Hajar Dewantara\n(May 2, 1889 - April 26, 1959)",
                descHero = "Ki Hajar Dewantara founded Taman Siswa in 1922, an educational movement emphasizing democratic and inclusive education for all. One of his notable works is \"Budi Utomo,\" addressing education in Indonesia. National Education Day is celebrated every year on May 2 to commemorate his birth and honor his significant role in Indonesia's educational development.",
                julukan = "Bapak Pendidikan Nasional (Father of National Education)",
                imageResourceId = R.drawable.kihajardewantara
            ),
            Hero(
                nameHero = "Tuanku Imam Bonjol\n(January 1, 1772 - November 6, 1864)",
                descHero = "Tuanku Imam Bonjol fiercely led resistance against Dutch colonization in the Minangkabau region, West Sumatra. He led the Padri War (1821-1837) against the Dutch, supported by the Padri group. Imam Bonjol was captured by the Dutch in 1837 and exiled to Manado and later to Makassar in Sulawesi, where he lived until his death in 1864.",
                julukan = "Peto Syarif",
                imageResourceId = R.drawable.tuankuimambonjol
            ),
            Hero(
                nameHero = "Sultan Hasanuddin\n(January 12, 1631 - June 12, 1670)",
                descHero = "Hasanuddin was the 16th Sultan of Gowa in South Sulawesi. He led a rebellion against Dutch colonial rule in the early 17th century, known as the Bantaeng Rebellion (1659-1669). In 1667, Sultan Hasanuddin signed the Bungaya Agreement with the Dutch. While the agreement recognized the sovereignty of the kingdoms in South Sulawesi, it also brought taxation and economic dependency on the Dutch.",
                julukan = "Ayam Jantan Dari Timur (The Rooster of the East)",
                imageResourceId = R.drawable.sultanhasanuddin
            ),
            Hero(
                nameHero = "Pattimura\n(June 8, 1783 - December 16, 1817)",
                descHero = "In 1817, Pattimura led a rebellion against Dutch colonial rule on Saparua Island, Maluku. Known as the Pattimura Rebellion, it was an effort to resist oppression and demand justice. Pattimura and his troops successfully captured Fort Duurstede, a crucial Dutch fortress. He was captured by the Dutch and executed in Ambon, Maluku.",
                julukan = "Thomas Matulessy",
                imageResourceId = R.drawable.pattimura
            ),
            Hero(
                nameHero = "Dewi Sartika\n(December 4, 1884 - September 11, 1947)",
                descHero = "Dewi Sartika actively fought for women's education rights in early 20th-century Indonesia. She established the first school for women, the \"Sekolah Isteri Dewi Sartika,\" in 1904. By founding schools for women, Dewi Sartika made a significant contribution to increasing the education level of women in Indonesia, working to change societal perceptions of women's roles in social and economic life.",
                julukan = "Djuragan Ageung",
                imageResourceId = R.drawable.dewisartika
            )
        )
    }
}
