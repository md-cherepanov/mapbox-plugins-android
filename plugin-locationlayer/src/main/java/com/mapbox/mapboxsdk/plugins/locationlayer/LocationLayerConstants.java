package com.mapbox.mapboxsdk.plugins.locationlayer;

/**
 * Contains all the constants being used for the My Location layer.
 *
 * @since 0.1.0
 */
class LocationLayerConstants {

  private LocationLayerConstants() {
    // Class should not be initialized
  }

  // Controls the compass update rate in milliseconds
  static final int COMPASS_UPDATE_RATE_MS = 500;

  // Sets the animation time when moving the user location icon from the previous location to the updated. If
  // LinearAnimator's enabled, this values ignored.
  static final int LOCATION_UPDATE_DELAY_MS = 500;

  // Sources
  static final String LOCATION_SOURCE = "mapbox-location-source";
  static final String PROPERTY_GPS_BEARING = "mapbox-property-gps-bearing";
  static final String PROPERTY_COMPASS_BEARING = "mapbox-property-compass-bearing";
  static final String PROPERTY_LOCATION_STALE = "mapbox-property-location-stale";
  static final String PROPERTY_ACCURACY_RADIUS = "mapbox-property-accuracy-radius";
  static final String PROPERTY_ACCURACY_COLOR = "mapbox-property-accuracy-color";
  static final String PROPERTY_ACCURACY_ALPHA = "mapbox-property-accuracy-alpha";
  static final String PROPERTY_FOREGROUND_ICON_OFFSET = "mapbox-property-foreground-icon-offset";
  static final String PROPERTY_SHADOW_ICON_OFFSET = "mapbox-property-shadow-icon-offset";

  // Layers
  static final String FOREGROUND_LAYER = "mapbox-location-layer";
  static final String BACKGROUND_LAYER = "mapbox-location-stroke-layer";
  static final String ACCURACY_LAYER = "mapbox-location-accuracy-layer";
  static final String BEARING_LAYER = "mapbox-location-bearing-layer";
  static final String NAVIGATION_LAYER = "mapbox-location-navigation-layer";

  // Icons
  static final String LOCATION_ICON = "mapbox-location-icon";
  static final String BEARING_ICON = "mapbox-location-bearing-icon";
  static final String BACKGROUND_ICON = "mapbox-location-stroke-icon";
  static final String PUCK_ICON = "mapbox-location-puck-icon";
}
