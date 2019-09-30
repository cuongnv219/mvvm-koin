package com.katana.koin.ui.home

import android.os.Bundle
import com.base.BaseFragment
import com.katana.koin.BR
import com.katana.koin.R
import com.katana.koin.databinding.FragmentHomeBinding
import com.katana.koin.ui.other.OtherHihi
import com.utils.ext.isExistFragmentInBackStack
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(), HomeNavigator {

    private val homeViewModel: HomeViewModel by viewModel()
    private val otherHihi: OtherHihi by inject()

    override fun getViewModel(): HomeViewModel = homeViewModel

    override fun getLayoutId(): Int = R.layout.fragment_home

    override fun getBindingVariable(): Int = BR.homeModel

    override fun updateUI(savedInstanceState: Bundle?) {
        homeViewModel.setNavigator(this)
        toast(otherHihi.toString())

        val a = isExistFragmentInBackStack<HomeFragment>(R.id.content_home)
    }
}
