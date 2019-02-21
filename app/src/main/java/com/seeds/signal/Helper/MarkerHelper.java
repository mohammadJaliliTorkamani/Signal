package com.seeds.signal.Helper;

import android.content.Context;

import com.seeds.signal.Entity.Marker;
import com.seeds.signal.Interface.App_Interface.MarkerOperation;
import com.seeds.signal.Interface.App_Interface.SmartRunnable;

import java.util.List;

public class MarkerHelper implements MarkerOperation {
    private static MarkerHelper instance;
    private Context context;

    private MarkerHelper(Context context) {
        this.context = context;
    }

    public static MarkerHelper getInstance(Context context) {
        if (instance == null)
            instance = new MarkerHelper(context);
        return instance;
    }

    @Override
    public void getMarkers(SmartRunnable<List<Marker>> runnable, int... id) {

    }

    @Override
    public void deleteMarkers(SmartRunnable<List<Integer>> runnable, int... id) {

    }

    @Override
    public void editMarker(SmartRunnable<Integer> runnable, int id, Marker newMarker) {

    }

    @Override
    public void updateMarkerLocation(SmartRunnable<Integer> runnable, int id, long new_latitude, long new_longitude) {

    }
}