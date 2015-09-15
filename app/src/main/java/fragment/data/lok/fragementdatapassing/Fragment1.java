package fragment.data.lok.fragementdatapassing;

import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by lokesh on 15/9/15.
 */
public class Fragment1 extends Fragment implements View.OnClickListener{
    Button mSendData;
    DataSenderInterFace send;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one,container,false);
    }

    /*
        make sure you initialize your ui component in onActivityCreated
        not in onCreate , because  this method is call with activity onCreate method
        that will throw error
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        send = (DataSenderInterFace) getActivity();
        mSendData = (Button) getActivity().findViewById(R.id.send_data);
        mSendData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        send.sendData("Ravana is the new God");

    }
}
