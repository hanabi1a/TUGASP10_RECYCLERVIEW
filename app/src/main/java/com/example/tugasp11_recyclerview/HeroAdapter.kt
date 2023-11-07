package com.example.tugasp11_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasp11_recyclerview.databinding.ItemHeroBinding

//intinya kelas HeroAdapter digunakan untuk menghubungkan data Hero dengan RecyclerView
// dan menanggapi interaksi pengguna, interaksinya berupa klik pada item maka akan menampilkan toast.

class HeroAdapter(private val heroList: List<Hero>, private val onItemClick: (Hero) -> Unit) :
    RecyclerView.Adapter<HeroAdapter.HeroViewHolder>() {

    //HeroAdapter adalah kelas adapter yang mengimplementasikan RecyclerView.Adapter.
    // Konstruktor menerima dua parameter: heroList, yang merupakan daftar objek Hero yang akan ditampilkan,
    // dan onItemClick, yang merupakan fungsi yang akan dipanggil ketika suatu item di RecyclerView diklik.

    inner class HeroViewHolder(private val binding: ItemHeroBinding) :
        RecyclerView.ViewHolder(binding.root) {

        //HeroViewHolder adalah kelas yang bertanggung jawab untuk menangani tampilan setiap item dalam RecyclerView.
        // Kelas ini mengimplementasikan RecyclerView.ViewHolder dan memiliki fungsi bind untuk menghubungkan data dari objek Hero
        // ke tampilan-tampilan dalam layout item.

        fun bind(data: Hero) {
            binding.apply {

                // Mengatur teks pada tampilan-tampilan dalam layout menggunakan data dari objek Hero
                txtHeroName.text = data.nameHero
                txtHeroDesc.text = data.descHero
                txtHeroJulukan.text = data.julukan

                // Mengatur gambar menggunakan resource ID
                ivHero.setImageResource(data.imageResourceId)

                // Menangani klik pada item dengan memanggil fungsi onItemClick yang diteruskan dari konstruktor
                root.setOnClickListener { onItemClick(data) }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val binding =
            ItemHeroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HeroViewHolder(binding)
    }

    //onCreateViewHolder digunakan untuk membuat dan menginisialisasi instance dari HeroViewHolder.
    // Di sini, ItemHeroBinding digunakan untuk menghubungkan tampilan item dengan objek HeroViewHolder.

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.bind(heroList[position])
    }

    //onBindViewHolder digunakan untuk menghubungkan data dari objek Hero pada posisi tertentu dalam
    // heroList ke tampilan dalam HeroViewHolder.

    override fun getItemCount(): Int = heroList.size
    //getItemCount mengembalikan jumlah item dalam daftar heroList
}