package com.qizhu.qizhugoshshopping.Frment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.qizhu.qizhugoshshopping.R;
import com.qizhu.qizhugoshshopping.adapter.XRAdapter;
import com.qizhu.qizhugoshshopping.bean.SuperClass;
import com.qizhu.qizhugoshshopping.utils.API;
import com.qizhu.qizhugoshshopping.utils.GsonObjectCallback;
import com.qizhu.qizhugoshshopping.utils.OkHttp3Utils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Call;

/**
 * Created by Long° Engagement on 2017/10/11.
 */

public class Fr_home extends Fragment {
    XRecyclerView xr;
    List<String > list=new ArrayList<>();
    int curr;
    XRAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home,container,false);
        xr= (XRecyclerView) view.findViewById(R.id.xre_xrv);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        xr.setLayoutManager(layoutManager);
        xr.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                curr=0;
                list.clear();
                getData(API.TYPE_HOME,curr);
                xr.refreshComplete();
            }

            @Override
            public void onLoadMore() {
             /*   curr++;
                getData(API.TYPE_HOME,curr);
                xr.refreshComplete();*/
            }
        });
        getData(API.TYPE_HOME,1);
        return view;
    }
    private void getData(String url,int curr){
        OkHttp3Utils.getInstance().doGet(url, new GsonObjectCallback<SuperClass>() {

            @Override
            public void onUi(SuperClass superClass) {
                superClass.getMsg();
                XRAdapter  mxradapter=new XRAdapter(getActivity(),superClass.getData());
                xr.setAdapter(mxradapter);
            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });


    }
}