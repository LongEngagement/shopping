package com.qizhu.qizhugoshshopping.Frment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.qizhu.qizhugoshshopping.Longing;
import com.qizhu.qizhugoshshopping.R;
/**
 * Created by Long° Engagement on 2017/10/11.
 */
public class Fr_user extends Fragment {
    ImageView img;
    TextView uesr_tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.activity_user,null);
        img = view.findViewById(R.id.img);
        uesr_tv = view.findViewById(R.id.uesr_tv);
        Intent intent3 = getActivity().getIntent();
        String name = intent3.getStringExtra("name");
        uesr_tv.setText(name);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Longing.class);
                startActivity(intent);
            }
        });

        return view;
    }


}
