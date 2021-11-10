package com.example.skismoring.utils

/*
This function converts the easting and northing format for locations and converts it into
the latitude and longitude format that is used for the Met-api. It is an advanced mathematical
formula that we have gotten from:
 */
fun convertToLatLng (z: String?, e: String?, n: String?): Pair<String, String> {
    var latitude: Double
    var longitude: Double

    if (z == null || e == null || n == null){
        return Pair("0","0")
    }

    val zone = z.toInt()
    val easting = e.toDouble()
    val northing = n.toDouble()
    val north: Double = northing
    latitude = (north / 6366197.724 / 0.9996 + (1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0) - 0.006739496742 * Math.sin(north / 6366197.724 / 0.9996) * Math.cos(north / 6366197.724 / 0.9996) * (Math.atan(Math.cos(Math.atan((Math.exp((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))) * (1 - 0.006739496742 * Math.pow((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))), 2.0) / 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0) / 3)) - Math.exp(-(easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))) * (1 - 0.006739496742 * Math.pow((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))), 2.0) / 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0) / 3))) / 2 / Math.cos((north - 0.9996 * 6399593.625 * (north / 6366197.724 / 0.9996 - 0.006739496742 * 3 / 4 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.pow(0.006739496742 * 3 / 4, 2.0) * 5 / 3 * (3 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 4 - Math.pow(0.006739496742 * 3 / 4, 3.0) * 35 / 27 * (5 * (3 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 4 + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 3)) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))) * (1 - 0.006739496742 * Math.pow((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))), 2.0) / 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) + north / 6366197.724 / 0.9996))) * Math.tan((north - 0.9996 * 6399593.625 * (north / 6366197.724 / 0.9996 - 0.006739496742 * 3 / 4 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.pow(0.006739496742 * 3 / 4, 2.0) * 5 / 3 * (3 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 4 - Math.pow(0.006739496742 * 3 / 4, 3.0) * 35 / 27 * (5 * (3 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 4 + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 3)) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))) * (1 - 0.006739496742 * Math.pow((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))), 2.0) / 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) + north / 6366197.724 / 0.9996)) - north / 6366197.724 / 0.9996) * 3 / 2) * (Math.atan(Math.cos(Math.atan((Math.exp((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))) * (1 - 0.006739496742 * Math.pow((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))), 2.0) / 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0) / 3)) - Math.exp(-(easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))) * (1 - 0.006739496742 * Math.pow((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))), 2.0) / 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0) / 3))) / 2 / Math.cos((north - 0.9996 * 6399593.625 * (north / 6366197.724 / 0.9996 - 0.006739496742 * 3 / 4 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.pow(0.006739496742 * 3 / 4, 2.0) * 5 / 3 * (3 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 4 - Math.pow(0.006739496742 * 3 / 4, 3.0) * 35 / 27 * (5 * (3 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 4 + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 3)) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))) * (1 - 0.006739496742 * Math.pow((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))), 2.0) / 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) + north / 6366197.724 / 0.9996))) * Math.tan((north - 0.9996 * 6399593.625 * (north / 6366197.724 / 0.9996 - 0.006739496742 * 3 / 4 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.pow(0.006739496742 * 3 / 4, 2.0) * 5 / 3 * (3 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 4 - Math.pow(0.006739496742 * 3 / 4, 3.0) * 35 / 27 * (5 * (3 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 4 + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 3)) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))) * (1 - 0.006739496742 * Math.pow((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))), 2.0) / 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) + north / 6366197.724 / 0.9996)) - north / 6366197.724 / 0.9996)) * 180 / Math.PI
    latitude = Math.round(latitude * 10000000).toDouble()
    latitude = latitude / 10000000
    longitude = Math.atan((Math.exp((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))) * (1 - 0.006739496742 * Math.pow((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))), 2.0) / 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0) / 3)) - Math.exp(-(easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))) * (1 - 0.006739496742 * Math.pow((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))), 2.0) / 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0) / 3))) / 2 / Math.cos((north - 0.9996 * 6399593.625 * (north / 6366197.724 / 0.9996 - 0.006739496742 * 3 / 4 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.pow(0.006739496742 * 3 / 4, 2.0) * 5 / 3 * (3 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 4 - Math.pow(0.006739496742 * 3 / 4, 3.0) * 35 / 27 * (5 * (3 * (north / 6366197.724 / 0.9996 + Math.sin(2 * north / 6366197.724 / 0.9996) / 2) + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 4 + Math.sin(2 * north / 6366197.724 / 0.9996) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0) * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) / 3)) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))) * (1 - 0.006739496742 * Math.pow((easting - 500000) / (0.9996 * 6399593.625 / Math.sqrt(1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0))), 2.0) / 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2.0)) + north / 6366197.724 / 0.9996)) * 180 / Math.PI + zone * 6 - 183
    longitude = Math.round(longitude * 10000000).toDouble()
    longitude = longitude / 10000000

    return Pair(latitude.toString(), longitude.toString())
}