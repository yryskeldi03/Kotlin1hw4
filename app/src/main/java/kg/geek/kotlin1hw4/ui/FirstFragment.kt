package kg.geek.kotlin1hw4.ui

import androidx.lifecycle.ViewModelProvider
import kg.geek.kotlin1hw4.base.BaseFragment
import kg.geek.kotlin1hw4.databinding.FragmentFirstBinding
import kg.geek.kotlin1hw4.main.MainViewModel

class FirstFragment : BaseFragment<FragmentFirstBinding>() {

    private lateinit var viewModel: MainViewModel
    private var list = arrayListOf<String>()

    override fun inflateViewBinding(): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
    }

    override fun initClickListener() {
        binding.btnPlus.setOnClickListener {
            viewModel.onIncrementClick()
            list.add("+")
            viewModel.setHistory(list)
        }

        binding.btnMinus.setOnClickListener {
            viewModel.onPreIncrementClick()
            list.add("-")
            viewModel.setHistory(list)
        }
    }

    override fun observe() {}

}