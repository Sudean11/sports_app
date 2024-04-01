package com.example.myapplication.data

import com.example.myapplication.model.AthletesModel
import com.example.myapplication.model.NewsModel

class AthletesList {
    companion object {
            val athletesList = mutableListOf(
                AthletesModel(
                    "Usain Bolt",
                    "Athletics",
                    "Jamaica",
                    "9.58 seconds (100m)",
                    "Won 8 Olympic gold medals"
                ),
                AthletesModel(
                    "Simone Biles",
                    "Gymnastics",
                    "United States",
                    "4 golds, 1 bronze (Rio 2016)",
                    "Considered one of the greatest gymnasts of all time"
                ),
                AthletesModel(
                    "Michael Phelps",
                    "Swimming",
                    "United States",
                    "23 Olympic gold medals",
                    "Most decorated Olympian of all time"
                ),
                AthletesModel(
                    "Serena Williams",
                    "Tennis",
                    "United States",
                    "23 Grand Slam singles titles",
                    "Regarded as one of the greatest tennis players of all time"
                ),
                AthletesModel(
                    "Cristiano Ronaldo",
                    "Football",
                    "Portugal",
                    "5 FIFA Ballon d'Or awards",
                    "One of the greatest footballers of all time"
                )
            )
}}