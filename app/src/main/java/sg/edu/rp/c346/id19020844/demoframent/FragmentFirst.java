package sg.edu.rp.c346.id19020844.demoframent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

// THIS SET OF CODES IS TO IMPLEMENT A CLICK EVENT ACTION WHERE CLICKING
// THE BUTTON WILL APPEND SOME TEXT TO THE TEXTVIEW

public class FragmentFirst extends Fragment {

    Button btnAddText;
    TextView tvFrag1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        tvFrag1 = view.findViewById(R.id.tvFrag1);
        btnAddText = view.findViewById(R.id.btnAddTextFrag1);

        btnAddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = tvFrag1.getText().toString() + "\n" + "New Data";
                tvFrag1.setText(data);
            }
        });
        return view;
    }
}