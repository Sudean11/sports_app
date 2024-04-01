package com.example.myapplication.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.myapplication.R
import com.example.myapplication.data.AthletesList.Companion.athletesList
import com.example.myapplication.data.NewsList
import com.example.myapplication.model.AthletesModel
import com.example.myapplication.model.NewsModel

class AddAthleteDialogFragment: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val inflater = LayoutInflater.from(requireContext())
        val view = inflater.inflate(R.layout.add_athlete, null)

        // Initialize views
        val editTextAthleteName = view.findViewById<EditText>(R.id.editTextAthleteName)
        val editTextAthleteSport = view.findViewById<EditText>(R.id.editTextAthleteSport)
        val editTextAthleteCountry = view.findViewById<EditText>(R.id.editTextAthleteCountry)
        val editTextPersonalBest = view.findViewById<EditText>(R.id.editTextPersonalBest)
        val editTextFacts = view.findViewById<EditText>(R.id.editTextFacts)

        val btnCancelAthlete = view.findViewById<Button>(R.id.btnCancelAthlete)
        val btnAddAthlete = view.findViewById<Button>(R.id.btnAddAthlete)


        // Set click listener for cancel button
        btnCancelAthlete.setOnClickListener {
            dismiss()
        }

        // Set click listener for add button
        btnAddAthlete.setOnClickListener {
            val athleteName = editTextAthleteName.text.toString()
            val athleteSport = editTextAthleteSport.text.toString()
            val athleteCountry = editTextAthleteCountry.text.toString()
            val personalBest = editTextPersonalBest.text.toString()
            val facts = editTextFacts.text.toString()
            athletesList.add(AthletesModel(athleteName, athleteSport, athleteCountry, personalBest, facts))
            dismiss()
        }

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        return builder.create()
    }

}