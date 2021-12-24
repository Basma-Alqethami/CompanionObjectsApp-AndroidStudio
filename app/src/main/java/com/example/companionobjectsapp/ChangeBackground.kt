package com.example.companionobjectsapp

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class ChangeBackground {

    companion object {

        fun Background(view: View, text: String){

            if(text == "day"){
                view.setBackgroundResource(R.drawable.day)
            }
            else{
                view.setBackgroundResource(R.drawable.night)
            }
        }
    }

}