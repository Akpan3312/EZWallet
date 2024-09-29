package com.example.ezwallet

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.ezwallet.RecentActivity


class ProfileFragment: Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val recentActivityContainer: LinearLayout =
            view.findViewById(R.id.recent_activity_container)

        val recentActivityItems = listOf(RecentActivity(
                R.drawable.ic_launcher_background,
                "Zaire Philips",
                "Added",
                1200.00,
                true
            )
                    RecentActivity (R.drawable.face2), "PureGym", "Paid", -246.00, false)
        RecentActivity(
            R.drawable.face4,
            "Haylie Bergson",
            "Received",
            520.00,
            false
        )

        for (activity in recentActivity) {
            val itemView = LayoutInflater.from(requireContext())
                .inflate(R.layout.items_recent_activity, recentActivityContainer, false)
            val imageView: ImageView = itemView.findViewById(R.id.recent_activity_image)
            val nameView: TextView = itemView.findViewById(R.id.recent_activity_name)
            val descriptionView: TextView = itemView.findViewById(R.id.recent_activity_description)
            val amountView: TextView = itemView.findViewById(R.id.recent_activity_amount)

            imageView.setImageResource(activity.imageResId)
            nameView.text = activity.name
            descriptionView.text = activity.description
            amountView.text = activity.amount.toString()

            if (activity.isPositive) {
                amountView.text = "+$${activity.amount}"
                amountView.setTextColor(resources.getColor(R.color.holo_green_dark))
            } else {
                amountView.setTextColor(resources.getColor(R.color.red))
            }
            recentActivityContainer.addView(itemView)
        }
        return view
    }


    }











