package akakom.ricoadityaherlambang.recyclerviewmedium

import android.view.View

interface RecyclerViewClickListener {

    // method yang akan dipanggil di MainActivity
    fun onItemClicked(view: View, negara: Negara)

}