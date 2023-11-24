package kz.just_code.notifications_homework

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kz.just_code.notifications_homework.databinding.FragmentStartBinding

class StartFragment: Fragment() {
    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val notificationManager = MyNotificationManager(requireContext())

        if (requireActivity().intent.hasExtra("ACTION")){
            Toast.makeText(requireContext(), requireActivity().intent.getStringExtra("ACTION"), Toast.LENGTH_SHORT ).show()
        }

        binding.showButton.setOnClickListener {
            notificationManager.showMessage(requireContext())
        }
        binding.hideButton.setOnClickListener {
            notificationManager.clear(requireContext())
        }
        requireActivity().intent.data?.let {
            it.queryParameterNames.forEach { name ->
                Log.e(">>>", "$name: ${it.getQueryParameter(name)}")
            }
        }

    }

}