package fragment.data.lok.fragementdatapassing;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements DataSenderInterFace {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    @Override
    public void sendData(String data) {

        FragmentManager manager = getFragmentManager();
       Fragment2 fragment2= (Fragment2) manager.findFragmentById(R.id.fragment_2);
        fragment2.updateMe("updated data sent");


    }
}
