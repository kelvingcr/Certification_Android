package com.kelvingcr.materialparaestudos.colab.core.toast

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kelvingcr.materialparaestudos.*
import com.kelvingcr.materialparaestudos.databinding.FragmentToastSnakeBinding


class ToastSnakeFragment : Fragment() {

    private val binding by lazy { FragmentToastSnakeBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Defini a orientação manualmente da activity
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED

        binding.toast.setOnClickListener { showToast("Toast usando extenções") }
        binding.snakeAction.setOnClickListener { showSnakeAction("Snake com Ação") }
        binding.snake.setOnClickListener { showSnake("Snake sem Ação") }
    }
}