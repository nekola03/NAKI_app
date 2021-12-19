package com.example.digitalni_atlas;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.digitalni_atlas.databinding.ActivityGooglemapBinding;
import android.os.Handler;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.maps.android.data.geojson.GeoJsonLayer;
import com.google.maps.android.data.geojson.GeoJsonPolygonStyle;

import org.json.JSONException;

import java.io.IOException;

public class activityGooglemap extends FragmentActivity implements OnMapReadyCallback {

    private Marker bol, ck, jac, kac, kla, krk, kut, mos, pod, pkpr, ro, sp;
    private GoogleMap mMap;
    private int ACCESS_LOCATION_REQUEST_CODE = 1001;
    private ActivityGooglemapBinding binding;
    boolean doubleBackToExitPressedOnce = false;
    private Marker myMarker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityGooglemapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == getPackageManager().PERMISSION_GRANTED){
            enableuserlocation();}
        else {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.ACCESS_FINE_LOCATION)){
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},ACCESS_LOCATION_REQUEST_CODE);
            }
            else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, ACCESS_LOCATION_REQUEST_CODE);
            }

        }


        // Add a marker in Sydney and move the camera
        LatLng Boletice = new LatLng(48.8248749, 14.217335300000059);
        bol = mMap.addMarker(new MarkerOptions().position(Boletice).title("Boletice"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Boletice));

        LatLng ceska_kanada = new LatLng(49.0033501, 15.25412940000001);
        ck = mMap.addMarker(new MarkerOptions().position(ceska_kanada).title("Česká Kanada"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ceska_kanada));

        LatLng jachymovsko = new LatLng(50.361708131716604, 12.932449893505918);
        jac = mMap.addMarker(new MarkerOptions().position(jachymovsko).title("Jáchymovsko"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jachymovsko));

        LatLng kacina = new LatLng(49.981744, 15.345980000000054);
        kac = mMap.addMarker(new MarkerOptions().position(kacina).title("Kačina"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kacina));

        LatLng kladensko = new LatLng(50.14819292718137, 14.11714908339843);
        kla = mMap.addMarker(new MarkerOptions().position(kladensko).title("Kladensko"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kladensko));

        LatLng krkonose = new LatLng(50.7291276, 15.44868729999996);
        krk = mMap.addMarker(new MarkerOptions().position(krkonose).title("Krkonoše"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(krkonose));

        LatLng kutnohorsko = new LatLng(49.95243139999999, 15.268653599999993);
        kut = mMap.addMarker(new MarkerOptions().position(kutnohorsko).title("Kutnohorsko"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kutnohorsko));

        LatLng mostecko = new LatLng(50.50111815210686, 13.61780599882809);
        mos = mMap.addMarker(new MarkerOptions().position(mostecko).title("Mostecko"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mostecko));

        LatLng podbořansko = new LatLng(50.22937520000001, 13.411929699999973);
        pod = mMap.addMarker(new MarkerOptions().position(podbořansko).title("Podbořansko"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(podbořansko));

        LatLng pkp = new LatLng(49.970160, 14.591086399999995);
        pkpr = mMap.addMarker(new MarkerOptions().position(pkp).title("Příměstská krajina Prahy"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pkp));

        LatLng ros_osl = new LatLng(49.127267960838424, 16.340576374560555);
        ro = mMap.addMarker(new MarkerOptions().position(ros_osl).title("Rosicko-Oslavansko"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ros_osl));

        LatLng stredni_povltavi = new LatLng(49.750779, 14.409471899999971);
        sp = mMap.addMarker(new MarkerOptions().position(stredni_povltavi).title("Střední Povltaví"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stredni_povltavi));

        mMap.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(@NonNull Marker marker) {
                if (marker.equals(bol)){
                    Intent intent = new Intent(activityGooglemap.this, com.example.digitalni_atlas.ui.uzemiModel.boletice.bolActivity.class);
                    startActivity(intent);
                }
                else if (marker.equals(ck)){
                    Intent intent = new Intent(activityGooglemap.this, com.example.digitalni_atlas.ui.uzemiModel.cerna_v_posumavi.cvpActivity.class);
                    startActivity(intent);
                }
                else if (marker.equals(jac)){
                    Intent intent = new Intent(activityGooglemap.this, com.example.digitalni_atlas.ui.uzemiModel.jachymovsko.jachActivity.class);
                    startActivity(intent);
                }
                else if (marker.equals(kac)){
                    Intent intent = new Intent(activityGooglemap.this, com.example.digitalni_atlas.ui.uzemiModel.kacina.kachActivity.class);
                    startActivity(intent);
                }
                else if (marker.equals(kla)){
                    Intent intent = new Intent(activityGooglemap.this, com.example.digitalni_atlas.ui.uzemiModel.kladensko.kladActivity.class);
                    startActivity(intent);
                }
                else if (marker.equals(krk)){
                    Intent intent = new Intent(activityGooglemap.this, com.example.digitalni_atlas.ui.uzemiModel.krkonose.krkActivity.class);
                    startActivity(intent);
                }
                else if (marker.equals(kut)){
                    Intent intent = new Intent(activityGooglemap.this, com.example.digitalni_atlas.ui.uzemiModel.kutnohorsko.kutActivity.class);
                    startActivity(intent);
                }
                else if (marker.equals(mos)){
                    Intent intent = new Intent(activityGooglemap.this, com.example.digitalni_atlas.ui.uzemiModel.mostecko.mostActivity.class);
                    startActivity(intent);
                }
                else if (marker.equals(pod)){
                    Intent intent = new Intent(activityGooglemap.this, com.example.digitalni_atlas.ui.uzemiModel.podboransko.podActivity.class);
                    startActivity(intent);
                }
                else if (marker.equals(pkpr)){
                    Intent intent = new Intent(activityGooglemap.this, com.example.digitalni_atlas.ui.uzemiModel.primestska_krajina_prahy.pkpActivity.class);
                    startActivity(intent);
                }
                else if (marker.equals(ro)){
                    Intent intent = new Intent(activityGooglemap.this, com.example.digitalni_atlas.ui.uzemiModel.rosicko_oslavansko.roActivity.class);
                    startActivity(intent);
                }
                else if (marker.equals(sp)){
                    Intent intent = new Intent(activityGooglemap.this, com.example.digitalni_atlas.ui.uzemiModel.rosicko_oslavansko.roActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
    private void enableuserlocation(){
        if (ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            return;
        }
        mMap.setMyLocationEnabled(true);
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == ACCESS_LOCATION_REQUEST_CODE){
            if (grantResults.length > 0 && grantResults[0] == getPackageManager().PERMISSION_GRANTED){
                enableuserlocation();
            }
        }
    }
}
