package kg.geek.kotlin1hw4.ui

import androidx.lifecycle.ViewModelProvider
import kg.geek.kotlin1hw4.base.BaseFragment
import kg.geek.kotlin1hw4.databinding.FragmentSecondBinding
import kg.geek.kotlin1hw4.main.MainViewModel

class SecondFragment : BaseFragment<FragmentSecondBinding>() {

    private lateinit var viewModel: MainViewModel

    override fun inflateViewBinding(): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
    }

    override fun observe() {
        viewModel.counter.observe(this) {
            binding.tvCounter.text = it.toString()
        }
    }

    override fun initClickListener() {}

}