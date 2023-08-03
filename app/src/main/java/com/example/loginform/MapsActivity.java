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

        LatLng ODCFAR = new LatLng(-6.190411, 106.984314);
        mMap.addMarker(new MarkerOptions().position(ODCFAR).title("ODC-KLB-FAR"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFAR));

        LatLng ODCFAT = new LatLng(-6.213900, 107.013800);
        mMap.addMarker(new MarkerOptions().position(ODCFAT).title("ODC-KLB-FAT"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFAT));

        LatLng ODCFAV = new LatLng(-6.190292, 106.977067);
        mMap.addMarker(new MarkerOptions().position(ODCFAV).title("ODC-KLB-FAV"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFAV));

        LatLng ODCFAY = new LatLng(-6.169100, 106.977300);
        mMap.addMarker(new MarkerOptions().position(ODCFAY).title("ODC-KLB-FAY"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFAY));

        LatLng ODCFBA = new LatLng(-6.210900, 107.021900);
        mMap.addMarker(new MarkerOptions().position(ODCFBA).title("ODC-KLB-FBA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFBA));

        LatLng ODCFBB = new LatLng(-6.219411, 107.024489);
        mMap.addMarker(new MarkerOptions().position(ODCFBB).title("ODC-KLB-FBB"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFBB));

        LatLng ODCFBD = new LatLng(-6.217800, 107.024600);
        mMap.addMarker(new MarkerOptions().position(ODCFBD).title("ODC-KLB-FBD"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFBD));

        LatLng ODCFBE = new LatLng(-6.204700, 107.026500);
        mMap.addMarker(new MarkerOptions().position(ODCFBE).title("ODC-KLB-FBE"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFBE));

        LatLng ODCFBJ = new LatLng(-6.217500, 107.006300);
        mMap.addMarker(new MarkerOptions().position(ODCFBJ).title("ODC-KLB-FBJ"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFBJ));

        LatLng ODCFBM = new LatLng(-6.203844, 106.997981);
        mMap.addMarker(new MarkerOptions().position(ODCFBM).title("ODC-KLB-FBM"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFBM));

        LatLng ODCFBN = new LatLng(-6.208714, 107.000328);
        mMap.addMarker(new MarkerOptions().position(ODCFBN).title("ODC-KLB-FBN"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFBN));

        LatLng ODCFBQ = new LatLng(-6.185267, 106.999317);
        mMap.addMarker(new MarkerOptions().position(ODCFBQ).title("ODC-KLB-FBQ"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFBQ));

        LatLng ODCFBS = new LatLng(-6.178400, 107.012419);
        mMap.addMarker(new MarkerOptions().position(ODCFBS).title("ODC-KLB-FBS"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFBS));

        LatLng ODCFBZ = new LatLng(-6.214400, 107.003800);
        mMap.addMarker(new MarkerOptions().position(ODCFBZ).title("ODC-KLB-FBZ"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFBZ));

        LatLng ODCFC = new LatLng(-6.197478, 106.985061);
        mMap.addMarker(new MarkerOptions().position(ODCFC).title("ODC-KLB-FC"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFC));

        LatLng ODCFCA = new LatLng(-6.168000, 106.976300);
        mMap.addMarker(new MarkerOptions().position(ODCFCA).title("ODC-KLB-FCA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFCA));

        LatLng ODCFCB = new LatLng(-6.165769, 106.985275);
        mMap.addMarker(new MarkerOptions().position(ODCFCB).title("ODC-KLB-FCB"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFCB));

        LatLng ODCFCC = new LatLng(-6.167000, 106.988300);
        mMap.addMarker(new MarkerOptions().position(ODCFCC).title("ODC-KLB-FCC"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFCC));

        LatLng ODCFCE = new LatLng(-6.178800, 106.974800);
        mMap.addMarker(new MarkerOptions().position(ODCFCE).title("ODC-KLB-FCE"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFCE));

        LatLng ODCFCH = new LatLng(-6.218303, 107.020181);
        mMap.addMarker(new MarkerOptions().position(ODCFCH).title("ODC-KLB-FCH"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFCH));

        LatLng ODCFDC = new LatLng(-6.220800, 107.014400);
        mMap.addMarker(new MarkerOptions().position(ODCFDC).title("ODC-KLB-FDC"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFDC));

        LatLng ODCFDE = new LatLng(-6.220000, 106.974200);
        mMap.addMarker(new MarkerOptions().position(ODCFDE).title("ODC-KLB-FDE"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFDE));

        LatLng ODCFDF = new LatLng(-6.173200, 106.974800);
        mMap.addMarker(new MarkerOptions().position(ODCFDF).title("ODC-KLB-FDF"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFDF));

        LatLng ODCFDH = new LatLng(-6.221178, 107.018681);
        mMap.addMarker(new MarkerOptions().position(ODCFDH).title("ODC-KLB-FDH"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFDH));

        LatLng ODCFDL = new LatLng(-6.165900, 106.973900);
        mMap.addMarker(new MarkerOptions().position(ODCFDL).title("ODC-KLB-FDL"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFDL));

        LatLng ODCFDN = new LatLng(-6.187200, 106.985600);
        mMap.addMarker(new MarkerOptions().position(ODCFDN).title("ODC-KLB-FDN"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFDN));

        LatLng ODCFE = new LatLng(-6.177300, 106.984500);
        mMap.addMarker(new MarkerOptions().position(ODCFE).title("ODC-KLB-FE"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFE));

        LatLng ODCFEA = new LatLng(-6.188900, 106.990700);
        mMap.addMarker(new MarkerOptions().position(ODCFEA).title("ODC-KLB-FEA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFEA));

        LatLng ODCFEB = new LatLng(-6.206000, 107.013900);
        mMap.addMarker(new MarkerOptions().position(ODCFEB).title("ODC-KLB-FEB"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFEB));

        LatLng ODCFEC = new LatLng(-6.183083, 107.008139);
        mMap.addMarker(new MarkerOptions().position(ODCFEC).title("ODC-KLB-FEC"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFEC));

        LatLng ODCFED = new LatLng(-6.196497, 106.975722);
        mMap.addMarker(new MarkerOptions().position(ODCFED).title("ODC-KLB-FED"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFED));

        LatLng ODCFEG = new LatLng(-6.205575, 107.021172);
        mMap.addMarker(new MarkerOptions().position(ODCFEG).title("ODC-KLB-FEG"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFEG));

        LatLng ODCFEH = new LatLng(-6.176586, 106.995875);
        mMap.addMarker(new MarkerOptions().position(ODCFEH).title("ODC-KLB-FEH"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ODCFEH));

    }
}
