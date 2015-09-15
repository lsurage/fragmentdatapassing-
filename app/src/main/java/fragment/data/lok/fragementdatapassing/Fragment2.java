package fragment.data.lok.fragementdatapassing;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lokesh on 15/9/15.
 */
public class Fragment2 extends Fragment {

    TextView mTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mTextView = (TextView) getActivity().findViewById(R.id.update_me);
    }

    public void updateMe(String updateString) {
        mTextView.setText(updateString);
    }
}
