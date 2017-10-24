package com.qizhu.qizhugoshshopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.qizhu.qizhugoshshopping.Frment.Fr_user;
import com.qizhu.qizhugoshshopping.bean.RegSupperClass;
import com.qizhu.qizhugoshshopping.utils.GsonObjectCallback;
import com.qizhu.qizhugoshshopping.utils.OkHttp3Utils;
import com.qizhu.qizhugoshshopping.view.Field;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

public class Longing extends AppCompatActivity {
    Button Login_btn;
    @BindView(R.id.Login_img)
    ImageView LoginImg;
    @BindView(R.id.zhuce)
    TextView zhuce;
    @BindView(R.id.Login_btn)
    Button LoginBtn;
    @BindView(R.id.LL)
    LinearLayout LL;
    @BindView(R.id.activity_longing)
    RelativeLayout activityLonging;
    @BindView(R.id.mobile)
    EditText mobile;
    @BindView(R.id.password)
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longing);
        init();
        ButterKnife.bind(this);
    }
    private void init() {
        mobile = (EditText) findViewById(R.id.mobile);
        password = (EditText) findViewById(R.id.password);
    }
    @OnClick({R.id.Login_img, R.id.zhuce, R.id.Login_btn, R.id.LL, R.id.activity_longing})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Login_img:
                break;
            case R.id.zhuce:
                Intent intent1 = new Intent(Longing.this, ZhuCe.class);
                startActivity(intent1);
                break;
            case R.id.Login_btn:
                String mob = mobile.getText().toString();
                String pass = password.getText().toString();
                LoginUser(mob, pass);
                break;
            case R.id.LL:
                break;
            case R.id.activity_longing:
                break;
        }
    }

    private void LoginUser(String mob, String pass) {

        OkHttp3Utils.getInstance().doGet(Field.LOGIN_URL + "?mobile=" + mob + "&" + "password=" + pass, new GsonObjectCallback<RegSupperClass>() {
            @Override
            public void onUi(RegSupperClass regSupperClass) {
                if(regSupperClass.getMsg().equals("登录成功")){
                    Toast.makeText(Longing.this,"登录成功了",Toast.LENGTH_SHORT).show();
                    String name = mobile.getText().toString();
                    Intent intent2 = new Intent(Longing.this, Fr_user.class);
                    intent2.putExtra("name",name);
                     startActivity(intent2);
                }else{

                    Toast.makeText(Longing.this,regSupperClass.getMsg(),Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailed(Call call, IOException e) {

            }
        });
    }


}
