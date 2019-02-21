package com.seeds.signal.Interface.App_Interface;

import com.seeds.signal.Entity.Marker;

import java.util.List;

public interface MarkerOperation {
    void getMarkers(SmartRunnable<List<Marker>> runnable, int... id); //from server

    void deleteMarkers(SmartRunnable<List<Integer>> runnable, int... id); //from server

    void editMarker(SmartRunnable<Integer> runnable, int id, Marker newMarker);

    void updateMarkerLocation(SmartRunnable<Integer> runnable, int id, long new_latitude, long new_longitude);//from server
}
