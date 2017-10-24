package com.qizhu.qizhugoshshopping.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.qizhu.qizhugoshshopping.R;
import com.qizhu.qizhugoshshopping.bean.SuperClass;
import com.youth.banner.Banner;
import java.util.ArrayList;
/**
 * Created by Long° Engagement on 2017/10/23.
 */
public class XRAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    SuperClass.DataBean list;
    Context mcontext;
    ArrayList  mlist;
    ArrayList list_1;
    ArrayList list_2;
    //枚举类型
    private  enum  Item_Type{
        Typeone ,Typetwo,Typethree,Typefour
    }
    public XRAdapter(Context context, SuperClass.DataBean data) {
        this.mcontext=context;
        this.list=data;
    }
    /**
     * 创建ViewHolder
     * @param parent
     * @param viewType :不同ItemView的类型
     * @return
     */
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == Item_Type.Typeone.ordinal()) {
            View mView = LayoutInflater.from(mcontext).inflate(R.layout.recycle_item_a, null);
            ViewHolderA viewHolder = new ViewHolderA(mView);
            return viewHolder;

        } else if (viewType == Item_Type.Typetwo.ordinal()) {
            View mView = LayoutInflater.from(mcontext).inflate(R.layout.recycle_item_b, null);
            ViewHolderB viewHolder = new ViewHolderB(mView);
            return viewHolder;
        } else if (viewType == Item_Type.Typethree.ordinal()) {
            View mView = LayoutInflater.from(mcontext).inflate(R.layout.recycle_item_c, null);
            ViewHolderC viewHolder = new ViewHolderC(mView);
            return viewHolder;
        }else if (viewType == Item_Type.Typefour.ordinal()) {
            View mView = LayoutInflater.from(mcontext).inflate(R.layout.recycle_item_d, null);
            ViewHolderD viewHolder = new ViewHolderD(mView);
            return viewHolder;
        }
        return null;
    }

    /**
     * 绑定数据：可以直接拿到已经绑定控件的Viewholder对象
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolderA) {
            mlist=new ArrayList();
            for(int i=0;i<list.getAd1().size();i++){
                mlist.add(list.getAd1().get(i).getImage());
            }
            //设置图片加载器
            ((ViewHolderA) holder).mbanner.setImageLoader(new GlideImaGlideImageLoader());
            ((ViewHolderA) holder).mbanner.setImages(mlist);
            ((ViewHolderA) holder).mbanner.start();

        } else if (holder instanceof ViewHolderB) {
                ViewHolderB vb = (ViewHolderB) holder;
            vb.tv_1.setText(list.getAd5().get(0).getTitle());
            vb.tv_2.setText(list.getAd5().get(1).getTitle());
            vb.tv_3.setText(list.getAd5().get(2).getTitle());
            vb.tv_4.setText(list.getAd5().get(3).getTitle());
            ImageLoader.getInstance().displayImage(list.getAd5().get(0).getImage(),vb.img_1);
            ImageLoader.getInstance().displayImage(list.getAd5().get(1).getImage(),vb.img_2);
            ImageLoader.getInstance().displayImage(list.getAd5().get(2).getImage(),vb.img_3);
            ImageLoader.getInstance().displayImage(list.getAd5().get(3).getImage(),vb.img_4);


        } else if (holder instanceof ViewHolderC) {
            list_1 = new ArrayList();
            MyAdapter adapter;
            ViewHolderC vb = (ViewHolderC) holder;
            for (int i=0;i<list.getActivityInfo().getActivityInfoList().size();i++){
                SuperClass.DataBean.ActivityInfoBean.ActivityInfoListBean listBean  = list.getActivityInfo().getActivityInfoList().get(i);
                list_1.add(listBean.getActivityImg());
            }
            vb.recyclerview_1.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
            vb.recyclerview_1.setAdapter(adapter =new MyAdapter(list_1,mcontext));
          //  vb.mRecyclerView_1.setAdapter(adapter);

        }else if (holder instanceof ViewHolderD) {
            list_2 = new ArrayList();
            MyAdapter_1 adapter_1;
            ViewHolderD  vd = (ViewHolderD) holder;
            for (int i =0;i<list.getDefaultGoodsList().size();i++){
                SuperClass.DataBean.SubjectsBean subjectsBean = list.getSubjects().get(i);
                list_2.add(subjectsBean.getImage());
            }
            vd.recyclerView_2.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
            vd.recyclerView_2.setAdapter(adapter_1 = new MyAdapter_1(list_2,mcontext));
        }

    }

    @Override
    public int getItemCount() {
        return 4;
    }
    //返回值赋值给onCreateViewHolder的参数 viewType
    @Override
    public int getItemViewType(int position) {
        // return super.getItemViewType(position);

        if (position == 0) {
            return Item_Type.Typeone.ordinal();
        } else if (position == 1) {
            return Item_Type.Typetwo.ordinal();
        } else if (position == 2) {
            return Item_Type.Typethree.ordinal();
        }else if (position == 3) {
            return Item_Type.Typefour.ordinal();
        }
        return -1;


    }
    class ViewHolderA extends RecyclerView.ViewHolder {

        public Banner mbanner;
        public ViewHolderA(View itemView) {
            super(itemView);
            mbanner = (Banner) itemView.findViewById(R.id.mybanner);
        }
    }


    class ViewHolderB extends RecyclerView.ViewHolder {
        ImageView img_1,img_2,img_3, img_4;
        TextView tv_1,tv_2,tv_3,tv_4;
        public ViewHolderB(View itemView) {
            super(itemView);
           img_1 =itemView.findViewById(R.id.img_1);
            img_2 =itemView.findViewById(R.id.img_2);
            img_3 =itemView.findViewById(R.id.img_3);
            img_4 =itemView.findViewById(R.id.img_4);
            tv_1 = itemView.findViewById(R.id.tv_1);
            tv_2 = itemView.findViewById(R.id.tv_2);
            tv_3 = itemView.findViewById(R.id.tv_3);
            tv_4 = itemView.findViewById(R.id.tv_4);



        }
    }

    class ViewHolderC extends RecyclerView.ViewHolder {
      RecyclerView recyclerview_1;
        public ViewHolderC(View itemView) {
            super(itemView);
            recyclerview_1 =  itemView.findViewById(R.id.recyclerview_1);
        }
    }
    class ViewHolderD extends RecyclerView.ViewHolder {
       RecyclerView recyclerView_2;
        public ViewHolderD(View itemView) {
            super(itemView);
            recyclerView_2 = itemView.findViewById(R.id.recyclerView_2);
        }
    }
}
