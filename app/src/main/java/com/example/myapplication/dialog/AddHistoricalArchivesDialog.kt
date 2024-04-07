package com.example.myapplication.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.myapplication.R
import com.example.myapplication.data.AthletesList
import com.example.myapplication.data.HistoricalArchiveList
import com.example.myapplication.model.AthletesModel
import com.example.myapplication.model.HistoricalArchiveModel

class AddHistoricalArchivesDialog: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val inflater = LayoutInflater.from(requireContext())
        val view = inflater.inflate(R.layout.add_historical_event, null)

        // Initialize views
        val editTextAthleteName = view.findViewById<EditText>(R.id.editTextAthleteName)
        val editTextAthleteSport = view.findViewById<EditText>(R.id.editTextAthleteSport)
        val editTextAthleteCountry = view.findViewById<EditText>(R.id.editTextAthleteCountry)
        val btnCancelAthlete = view.findViewById<TextView>(R.id.historical_btn_cancel)
        val btnAddAthlete = view.findViewById<TextView>(R.id.historical_btn_add)


        // Set click listener for cancel button
        btnCancelAthlete.setOnClickListener {
            dismiss()
        }

        // Set click listener for add button
        btnAddAthlete.setOnClickListener {
            val athleteName = editTextAthleteName.text.toString()
            val athleteSport = editTextAthleteSport.text.toString()
            val athleteCountry = editTextAthleteCountry.text.toString()
            HistoricalArchiveList.historicalAdapterList.add(HistoricalArchiveModel(athleteName, athleteSport, athleteCountry))
            dismiss()
        }

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        return builder.create()
    }

}