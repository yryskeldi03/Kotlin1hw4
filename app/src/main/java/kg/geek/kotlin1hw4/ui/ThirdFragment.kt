package kg.geek.kotlin1hw4.ui

import androidx.lifecycle.ViewModelProvider
import kg.geek.kotlin1hw4.base.BaseFragment
import kg.geek.kotlin1hw4.adapters.ThirdFragmentAdapter
import kg.geek.kotlin1hw4.databinding.FragmentThirdBinding
import kg.geek.kotlin1hw4.main.MainViewModel

class ThirdFragment : BaseFragment<FragmentThirdBinding>() {

    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: ThirdFragmentAdapter

    override fun inflateViewBinding(): FragmentThirdBinding {
        return FragmentThirdBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        adapter = ThirdFragmentAdapter()
    }

    override fun observe() {
        viewModel.historyList.observe(this) {
            adapter.addItem(it)
        }
        binding.rvHistory.adapter = adapter
    }

    override fun initClickListener() {}

}