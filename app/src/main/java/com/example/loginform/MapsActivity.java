package com.example.loginform;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

  /*  public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Ketika disentuh tombol back pada Android

        if (keyCode == KeyEvent.KEYCODE_BACK && WebView.canGoBack()) {
            WebView.goBack(); // method goback() ini berguna untuk kembali ke halaman sebelumnya
            return true;
        }

        // Jika tidak ada halaman yang pernah dibuka
        // Maka akan keluar dari activity (tutup aplikasi)

        return super.onKeyDown(keyCode, event);
    }
*/

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

        // ODC-KLB-FH
        LatLng ODCFH = new LatLng(-6.1845, 106.9886);
        mMap.addMarker(new MarkerOptions().position(ODCFH).title("ODC-KLB-FH"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFH));

        // ODC-KLB-FZY
        LatLng ODCFZY = new LatLng(-6.1901, 106.9843);
        mMap.addMarker(new MarkerOptions().position(ODCFZY).title("ODC-KLB-FZY"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFZY));

        // ODC-KLB-FA
        LatLng ODCFA = new LatLng(-6.19870459, 106.99320743);
        mMap.addMarker(new MarkerOptions().position(ODCFA).title("ODC-KLB-FA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFA));

        // ODC-KLB-FAA
        LatLng ODCFAA = new LatLng(-6.21527984, 107.02587592);
        mMap.addMarker(new MarkerOptions().position(ODCFAA).title("ODC-KLB-FAA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFAA));

        // ODC-KLB-FAB
        LatLng ODCFAB = new LatLng(-6.1831, 106.9742);
        mMap.addMarker(new MarkerOptions().position(ODCFAB).title("ODC-KLB-FAB"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFAB));

        // ODC-KLB-FAC
        LatLng ODCFAC = new LatLng(-6.177500, 106.998400);
        mMap.addMarker(new MarkerOptions().position(ODCFAC).title("ODC-KLB-FAC"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFAC));

        // ODC-KLB-FAM
        LatLng ODCFAM = new LatLng(-6.175500, 106.987500);
        mMap.addMarker(new MarkerOptions().position(ODCFAM).title("ODC-KLB-FAM"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFAM));

        // ODC-KLB-FAN
        LatLng ODCFAN = new LatLng(-6.198894, 107.006206);
        mMap.addMarker(new MarkerOptions().position(ODCFAN).title("ODC-KLB-FAN"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFAN));

        // ODC-KLB-FAQ
        LatLng ODCFAQ = new LatLng(-6.185100, 106.982400);
        mMap.addMarker(new MarkerOptions().position(ODCFAQ).title("ODC-KLB-FAQ"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFAQ));


    }
}
