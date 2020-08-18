package com.google.ar.core.examples.java.augmentedimage

import android.util.Log
import com.google.ar.core.AugmentedImage

object TrackImage {

    fun trackImage(augmentedImage: AugmentedImage) {
        val pose = augmentedImage.centerPose
        Log.d("augtrack", "${pose.tx()}, ${pose.ty()}, ${pose.tz()}")
    }

}