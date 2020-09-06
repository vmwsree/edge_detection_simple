package com.sample.edgedetection


import com.sample.edgedetection.processor.Corners
import org.opencv.core.Mat
import org.opencv.core.Point
import org.opencv.core.Size

class SourceManager {
    companion object {
        var pic: Mat? = null
        var corners: Corners? = null
        var size: Size? = null
        val defaultTl = Point(180.0, 320.0)
        val defaultTr = Point(1800.0, 320.0)
        val defaultBr = Point(1800.0, 3200.0)
        val defaultBl = Point(180.0, 3200.0)
    }
}