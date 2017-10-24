package com.qizhu.qizhugoshshopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.qizhu.qizhugoshshopping.bean.RegSupperClass;
import com.qizhu.qizhugoshshopping.utils.GsonObjectCallback;
import com.qizhu.qizhugoshshopping.utils.OkHttp3Utils;
import com.qizhu.qizhugoshshopping.view.Field;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

public class ZhuCe extends AppCompatActivity {

    @BindView(R.id.Register_back)
    TextView RegisterBack;
    @BindView(R.id.Register_name)
    EditText RegisterName;
    @BindView(R.id.Register_pass)
    EditText RegisterPass;
    @BindView(R.id.Register_password)
    EditText RegisterPassword;
    @BindView(R.id.Register_email)
    EditText RegisterEmail;
    @BindView(R.id.Register_btn)
    Button RegisterBtn;
    @BindView(R.id.activity_zhu_ce)
    LinearLayout activityZhuCe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhu_ce);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.Register_back, R.id.Register_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Register_back:
                Intent intent = new Intent(ZhuCe.this,Longing.class);
                startActivity(intent);
                break;
            case R.id.Register_btn:

                String name = RegisterName.getText().toString();
                String passa = RegisterPass.getText().toString();
                String passaa = RegisterPassword.getText().toString();
                String email = RegisterEmail.getText().toString();
                if(passa.equals(passaa)){
                    RegUser(name,passaa);
                }
                else {
                    Toast.makeText(ZhuCe.this,"密码不一致",Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }

    private void RegUser(String name, String passaa) {
        OkHttp3Utils.getInstance().doGet(Field.REG_URL + "?mobile=" + name+"&" + "password=" + passaa, new GsonObjectCallback<RegSupperClass>() {
            @Override
            public void onUi(RegSupperClass regSupperClass) {
                if (regSupperClass.getCode().equals("0")){
                    Toast.makeText(getApplicationContext(),"注册成功啦",Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(getApplicationContext(),regSupperClass.getMsg(),Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });
    }


}
