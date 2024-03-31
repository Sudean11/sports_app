package com.example.myapplication.ui

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.myapplication.R
import com.example.myapplication.data.SportsList.Companion.sportsList
import com.example.myapplication.model.SportsModel

class AddSportDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val inflater = LayoutInflater.from(requireContext())
        val view = inflater.inflate(R.layout.add_sports, null)

        // Initialize views
        val editTextSportName = view.findViewById<EditText>(R.id.editTextSportName)
        val editTextInstructions = view.findViewById<EditText>(R.id.editTextInstructions)
        val btnCancel = view.findViewById<Button>(R.id.btnCancel)
        val btnAdd = view.findViewById<Button>(R.id.btnAdd)

        // Set click listener for cancel button
        btnCancel.setOnClickListener {
            dismiss()
        }

        // Set click listener for add button
        btnAdd.setOnClickListener {
            val sportName = editTextSportName.text.toString()
            val instructions = editTextInstructions.text.toString()
            sportsList.add(SportsModel(sportName, instructions))
            dismiss()
        }

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        return builder.create()
    }
}
