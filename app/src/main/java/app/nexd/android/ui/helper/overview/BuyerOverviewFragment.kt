package app.nexd.android.ui.helper.overview

import android.os.Build
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import app.nexd.android.Preferences
import app.nexd.android.R
import app.nexd.android.api.model.RequestEntity
import kotlinx.android.synthetic.main.buyer_overview_fragment.*
import mva2.adapter.ListSection
import mva2.adapter.MultiViewAdapter

class BuyerOverviewFragment : Fragment() {

    private lateinit var viewModel: BuyerOverviewViewModel
    private lateinit var nearRequestsAdapter: MultiViewAdapter
    private lateinit var acceptedRequestsAdapter: MultiViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.buyer_overview_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BuyerOverviewViewModel::class.java)

        acceptedRequestsAdapter = MultiViewAdapter()
        acceptedRequests.layoutManager = LinearLayoutManager(context)
        acceptedRequests.adapter = acceptedRequestsAdapter

        nearRequestsAdapter = MultiViewAdapter();
        nearRequests.layoutManager = LinearLayoutManager(context)
        nearRequests.adapter = nearRequestsAdapter


        acceptedRequestsAdapter.registerItemBinders(
            BuyerOverviewBinder()
        )
        nearRequestsAdapter.registerItemBinders(
            BuyerOverviewBinder()
        )

        viewModel.run {
            getMyAcceptedRequests().observe(viewLifecycleOwner, Observer { requests ->

                val myAcceptedRequests = requests.filter {
                    it.status == RequestEntity.StatusEnum.ONGOING
                }
                updateAcceptedRequests(myAcceptedRequests)

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    acceptedRequestsSummary.text = Html.fromHtml(
                        getString(R.string.accepted_requests_summary).format(
                            myAcceptedRequests.map { requestEntity -> requestEntity.articles.size }.sum()),
                        Html.FROM_HTML_MODE_LEGACY
                    )
                } else {
                    acceptedRequestsSummary.text = Html.fromHtml(
                        getString(R.string.accepted_requests_summary).format(requests.size))
                }
            })

            getOtherOpenRequests().observe(viewLifecycleOwner, Observer { requests ->
                updateNearbyOpenRequests(requests)
            })
        }

        acceptedRequestsSummary.setOnClickListener {
            findNavController().navigate(BuyerOverviewFragmentDirections.actionBuyerOverviewFragmentToShoppingListFragment())
        }
    }

    override fun onResume() {
        super.onResume()

        viewModel.reloadData()
    }

    private fun updateAcceptedRequests(acceptedRequests: List<RequestEntity>) {
        acceptedRequestsAdapter.removeAllSections()

        val acceptedRequestsList = ListSection<RequestEntity>()

        acceptedRequestsList.addAll(acceptedRequests)
        acceptedRequestsList.setOnSelectionChangedListener { request: RequestEntity,
                                                             b: Boolean, _: MutableList<RequestEntity> ->
            if (b) {
                val action =
                    BuyerOverviewFragmentDirections.requestDetailAction(
                        request.id.toString()
                    )
                findNavController().navigate(action)
            }
        }
        acceptedRequestsAdapter.addSection(acceptedRequestsList)
    }

    private fun updateNearbyOpenRequests(nearRequests: List<RequestEntity>) {
        nearRequestsAdapter.removeAllSections()

        val nearRequestList = ListSection<RequestEntity>()
        nearRequestList.addAll(nearRequests)

        nearRequestList.setOnSelectionChangedListener { helpRequest: RequestEntity,
                                                        b: Boolean, _: MutableList<RequestEntity> ->
            if (b) {
                val action =
                    BuyerOverviewFragmentDirections.requestDetailAction(
                        helpRequest.id.toString()
                    )
                findNavController().navigate(action)
            }
        }
        nearRequestsAdapter.addSection(nearRequestList)
    }

}