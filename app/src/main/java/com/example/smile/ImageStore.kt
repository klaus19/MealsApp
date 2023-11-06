package com.example.smile

object ImageStore {


    val imagesNamesMap = hashMapOf(
        R.drawable.africa to "Afrika",
        R.drawable.activities to "Activities",
        R.drawable.airport to "Airport",
        R.drawable.airplane to "Airplane",
        R.drawable.ambulance to "Ambulance",
        R.drawable.animals to "Animals",
        R.drawable.antenna to "Antenna",
        ).toList().shuffled().take(4).toMap()

}