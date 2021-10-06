package kg.geek.kotlin1hw4.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.geek.kotlin1hw4.databinding.ItemHistoryBinding

class ThirdFragmentAdapter : RecyclerView.Adapter<ThirdFragmentAdapter.ViewHolder>() {

    private var historyItems = mutableListOf<String>()

    fun addItem(symbol: ArrayList<String>) {
        historyItems.clear()
        historyItems.addAll(symbol)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ThirdFragmentAdapter.ViewHolder {
        return ViewHolder(
            ItemHistoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ThirdFragmentAdapter.ViewHolder, position: Int) {
        holder.onBind(historyItems[position])
    }

    override fun getItemCount(): Int = historyItems.size

    inner class ViewHolder(private val binding: ItemHistoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(i: String) {
            binding.tvResult.text = i
        }

    }
}