package com.kelvingcr.materialparaestudos

import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

fun Fragment.navTo(resID: Int) = findNavController().navigate(resID)
fun Fragment.showToast(str: String, duration: Int = Toast.LENGTH_SHORT) = Toast.makeText(requireContext(), str, duration).show()
fun Fragment.showSnake(str: String, duration: Int = Toast.LENGTH_SHORT) = Snackbar.make(requireView(), str, duration).show()
fun Fragment.showSnakeAction(str: String, duration: Int = Toast.LENGTH_SHORT) = Snackbar.make(requireView(), str, duration)
    .setAction("Ok"){

    }.show()