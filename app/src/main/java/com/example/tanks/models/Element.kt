package com.example.tanks.models

import com.example.tanks.enums.Material

enum class Element(
    val viewId: Int,
    val material: Material,
    val coordinate: Coordinate
) {
}