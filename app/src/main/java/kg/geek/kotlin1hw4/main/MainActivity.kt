package kg.geek.kotlin1hw4.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import kg.geek.kotlin1hw4.adapters.ViewPagerAdapter
import kg.geek.kotlin1hw4.databinding.ActivityMainBinding
import kg.geek.kotlin1hw4.ui.FirstFragment
import kg.geek.kotlin1hw4.ui.SecondFragment
import kg.geek.kotlin1hw4.ui.ThirdFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ViewPagerAdapter
    private var tabTitle = mutableListOf("Operations", "Result", "History")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViewPager()
        initTabLayout()
    }

    private fun initTabLayout() {
        TabLayoutMediator(binding.tab, binding.viewPager) { tab, position ->
            tab.text = tabTitle[position]
        }.attach()
    }

    private fun initViewPager() {
        adapter = ViewPagerAdapter(this)
        adapter.setFragment(createList())
        binding.viewPager.adapter = adapter
    }

    private fun createList(): ArrayList<Fragment> =
        arrayListOf(FirstFragment(), SecondFragment(), ThirdFragment())

}