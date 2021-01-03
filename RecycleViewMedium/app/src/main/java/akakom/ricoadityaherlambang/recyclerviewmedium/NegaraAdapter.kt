package akakom.ricoadityaherlambang.recyclerviewmedium

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import akakom.ricoadityaherlambang.recycleviewmedium.R
import akakom.ricoadityaherlambang.recycleviewmedium.databinding.ItemNegaraBinding

class NegaraAdapter(private val negara: List<Negara>) : RecyclerView.Adapter<NegaraAdapter.NegaraViewHolder>() {

    inner class NegaraViewHolder(val itemNegaraBinding: ItemNegaraBinding) : RecyclerView.ViewHolder(itemNegaraBinding.root)

    var listener: RecyclerViewClickListener? = null

    // untuk mendapatkan jumlah data yang dimasukkan ke dalam adapter
    override fun getItemCount() = negara.size

    // untuk membuat setiap item recyclerview berdasarkan jumlah data yang dimasukkan ke dalam adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = NegaraViewHolder(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_negara, parent, false)
    )

    // untuk memasukkan atau set data ke dalam view
    override fun onBindViewHolder(holder: NegaraViewHolder, position: Int) {
        holder.itemNegaraBinding.tvNegara.text = negara[position].namaNegara
        holder.itemNegaraBinding.tvIbukota.text = negara[position].ibuKota

        // event onclick pada setiap item
        holder.itemNegaraBinding.listNegara.setOnClickListener {
            listener?.onItemClicked(it, negara[position])
        }
    }

}