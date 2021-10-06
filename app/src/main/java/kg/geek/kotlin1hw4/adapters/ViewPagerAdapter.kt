package kg.geek.kotlin1hw4.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {

    private var fragments = arrayListOf<Fragment>()

    fun setFragment(fragments: ArrayList<Fragment>){
        this.fragments = fragments
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]
}