package Modules;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import Modules.Route;

/**
 * Created by Don't fucking worry.
 */
public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
