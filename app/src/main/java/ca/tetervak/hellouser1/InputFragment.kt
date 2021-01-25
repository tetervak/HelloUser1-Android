package ca.tetervak.hellouser1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ca.tetervak.hellouser1.databinding.FragmentInputBinding

class InputFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = FragmentInputBinding.inflate(layoutInflater, container,false)

        binding.submitButton.setOnClickListener {
            val userName = binding.userNameInput.text.toString()
            val action = InputFragmentDirections.actionInputToOutput(userName)
            findNavController().navigate(action)
        }

        return binding.root
    }

}