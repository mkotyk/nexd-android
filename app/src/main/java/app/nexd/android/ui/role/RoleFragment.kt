package app.nexd.android.ui.role

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import app.nexd.android.R
import app.nexd.android.ui.view.SelectDialog
import kotlinx.android.synthetic.main.role_fragment.*

class RoleFragment : Fragment() {

    private lateinit var viewModel: RoleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.role_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RoleViewModel::class.java)

        role_button_buyer.setOnClickListener {
            findNavController().navigate(RoleFragmentDirections.actionRoleFragmentToHelperOverviewFragment())
        }

        role_button_seeker.setOnClickListener {
            findNavController().navigate(RoleFragmentDirections.actionRoleFragmentToRequesterOverviewFragment())
        }
    }

}