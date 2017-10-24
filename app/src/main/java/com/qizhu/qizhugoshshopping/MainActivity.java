package com.qizhu.qizhugoshshopping;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.qizhu.qizhugoshshopping.Frment.Fr_card;
import com.qizhu.qizhugoshshopping.Frment.Fr_class;
import com.qizhu.qizhugoshshopping.Frment.Fr_home;
import com.qizhu.qizhugoshshopping.Frment.Fr_user;
import com.uuzuche.lib_zxing.activity.CaptureActivity;
import com.uuzuche.lib_zxing.activity.CodeUtils;
import com.uuzuche.lib_zxing.activity.ZXingLibrary;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    Activity mActivity;
    int REQUEST_CODE = 01;
    ArrayList<Fragment> list;
    MyPageAdapter adapter;
    @BindView(R.id.leftImageView)
    ImageView leftImageView;
    @BindView(R.id.titleEditText)
    EditText titleEditText;
    @BindView(R.id.rightImageView)
    ImageView rightImageView;
    @BindView(R.id.LL)
    LinearLayout LL;
    @BindView(R.id.VP)
    ViewPager VP;
    @BindView(R.id.bottom_home)
    RadioButton bottomHome;
    @BindView(R.id.bottom_class)
    RadioButton bottomClass;
    @BindView(R.id.bottom_card)
    RadioButton bottomCard;
    @BindView(R.id.bottom_user)
    RadioButton bottomUser;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ZXingLibrary.initDisplayOpinion(this);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //二维码
        canyinzhang();
        //ViewPage滑动加按钮点击
        slip();
        titleEditText = (EditText) findViewById(R.id.titleEditText);
        titleEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, seekActivity.class);
                startActivity(intent);
            }
        });
    }
    private void slip() {
        list = new ArrayList<Fragment>();
        list.add(new Fr_home());
        list.add(new Fr_class());
        list.add(new Fr_card());
        list.add(new Fr_user());
        adapter = new MyPageAdapter(getSupportFragmentManager());
        mActivity = this;
        VP.setAdapter(adapter);
        VP.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        //字体颜色
                        bottomHome.setTextColor(ContextCompat.getColor(mActivity, R.color.main));
                        bottomClass.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                        bottomCard.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                        bottomUser.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                        //图片改变
                        bottomHome.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_home_press), null, null);
                        bottomClass.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_class), null, null);
                        bottomCard.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_cart), null, null);
                        bottomUser.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_user), null, null);

                        break;
                    case 1:
                        //字体颜色
                        bottomHome.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                        bottomClass.setTextColor(ContextCompat.getColor(mActivity, R.color.main));
                        bottomCard.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                        bottomUser.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                        //图片改变
                        bottomHome.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_home), null, null);
                        bottomClass.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_class_press), null, null);
                        bottomCard.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_cart), null, null);
                        bottomUser.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_user), null, null);
                        break;
                    case 2:
                        //字体颜色
                        bottomHome.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                        bottomClass.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                        bottomCard.setTextColor(ContextCompat.getColor(mActivity, R.color.main));
                        bottomUser.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                        //图片改变
                        bottomHome.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_home), null, null);
                        bottomClass.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_class), null, null);
                        bottomCard.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_cart_press), null, null);
                        bottomUser.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_user), null, null);
                        break;
                    case 3:
                        //字体颜色
                        bottomHome.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                        bottomClass.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                        bottomCard.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                        bottomUser.setTextColor(ContextCompat.getColor(mActivity, R.color.main));
                        //图片改变
                        bottomHome.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_home), null, null);
                        bottomClass.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_class), null, null);
                        bottomCard.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_cart), null, null);
                        bottomUser.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_user_press), null, null);
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        bottomHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VP.setCurrentItem(0);
                bottomHome.setTextColor(ContextCompat.getColor(mActivity, R.color.main));
                bottomClass.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                bottomCard.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                bottomUser.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                //图片改变
                bottomHome.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_home_press), null, null);
                bottomClass.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_class), null, null);
                bottomCard.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_cart), null, null);
                bottomUser.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_user), null, null);

            }
        });
        bottomClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VP.setCurrentItem(1);
                bottomHome.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                bottomClass.setTextColor(ContextCompat.getColor(mActivity, R.color.main));
                bottomCard.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                bottomUser.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                //图片改变
                bottomHome.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_home), null, null);
                bottomClass.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_class_press), null, null);
                bottomCard.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_cart), null, null);
                bottomUser.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_user), null, null);
            }
        });
        bottomCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VP.setCurrentItem(2);
                bottomHome.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                bottomClass.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                bottomCard.setTextColor(ContextCompat.getColor(mActivity, R.color.main));
                bottomUser.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                //图片改变
                bottomHome.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_home), null, null);
                bottomClass.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_class), null, null);
                bottomCard.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_cart_press), null, null);
                bottomUser.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_user), null, null);
            }
        });
        bottomUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VP.setCurrentItem(3);
                bottomHome.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                bottomClass.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                bottomCard.setTextColor(ContextCompat.getColor(mActivity, R.color.nav));
                bottomUser.setTextColor(ContextCompat.getColor(mActivity, R.color.main));
                //图片改变
                bottomHome.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_home), null, null);
                bottomClass.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_class), null, null);
                bottomCard.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_cart), null, null);
                bottomUser.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(mActivity, R.drawable.ic_nav_user_press), null, null);
            }
        });

    }

    private void canyinzhang() {
        leftImageView = (ImageView) findViewById(R.id.leftImageView);
        leftImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CaptureActivity.class);
                startActivityForResult(intent, REQUEST_CODE);

            }
        });
    }

    //在Activity的onActivityResult方法中接收扫描结果
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            //处理扫描结果（在界面上显示）
            if (null != data) {
                Bundle bundle = data.getExtras();
                if (bundle == null) {
                    return;
                }
                if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_SUCCESS) {
                    String result = bundle.getString(CodeUtils.RESULT_STRING);
                    Toast.makeText(this, "解析结果:" + result, Toast.LENGTH_LONG).show();
                } else if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_FAILED) {
                    Toast.makeText(MainActivity.this, "解析二维码失败", Toast.LENGTH_LONG).show();
                }
            }
        }
    }

    @OnClick({R.id.leftImageView, R.id.titleEditText, R.id.rightImageView, R.id.LL, R.id.VP, R.id.bottom_home, R.id.bottom_class, R.id.bottom_card, R.id.bottom_user, R.id.activity_main})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.leftImageView:
                break;
            case R.id.titleEditText:
                break;
            case R.id.rightImageView:
                break;
            case R.id.LL:
                break;
            case R.id.VP:
                break;
            case R.id.bottom_home:
                break;
            case R.id.bottom_class:
                break;
            case R.id.bottom_card:
                break;
            case R.id.bottom_user:
                break;
            case R.id.activity_main:
                break;
        }
    }

    //Viewpager的适配器
    class MyPageAdapter extends FragmentPagerAdapter {

        public MyPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }
}
