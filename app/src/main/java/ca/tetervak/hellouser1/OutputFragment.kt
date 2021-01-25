package ca.tetervak.hellouser1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import ca.tetervak.hellouser1.databinding.FragmentOutputBinding

class OutputFragment : Fragment() {

    private val safeArgs: OutputFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = FragmentOutputBinding.inflate(inflater,container,false)

        binding.userNameOutput.text = safeArgs.userName

        binding.backButton.setOnClickListener {
            val action = OutputFragmentDirections.actionGlobalInput()
            findNavController().navigate(action)
        }

        return binding.root
    }

}