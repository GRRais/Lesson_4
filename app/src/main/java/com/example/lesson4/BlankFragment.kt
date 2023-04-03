package com.example.lesson4

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson4.databinding.FragmentBlankBinding

private const val TAG = "BlankFragment"
class BlankFragment : Fragment() {
    private lateinit var _binding: FragmentBlankBinding
    private var _id: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onPause $_id")
        arguments?.let {
            _id = it.getString(ARG_ID)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG, "onCreateView $_id")
        _binding = FragmentBlankBinding.inflate(layoutInflater, container, false)
        _binding.tvValFragmentsTotal.text =
            (activity as ContainerActivity).fragmentsCount().toString()
        _binding.tvValBackstackTotal.text =
            (activity as ContainerActivity).backStackSize().toString()
        _binding.tvTest.text = _binding.tvTest.text.toString() + " " + _id
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume $_id")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause $_id")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop $_id")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState $_id")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView $_id")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy $_id")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach $_id")
    }

    companion object {
        private const val ARG_ID = "id"
        @JvmStatic
        fun newInstance(id: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_ID, id)
                }
            }
    }

}