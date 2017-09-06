package shain.ypt.com.recyclerviewadapter.B2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * 适配器父类
 * Created by ypt on 2017/9/6.
 */
public abstract class BaseAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {

    /**
     * layout资源id
     */
    private int layoutResId;
    /**
     * 数据
     */
    private ArrayList<T> mData;

    /**
     * 构造器
     * @param resId layout资源id
     * @param data  数据
     */
    public BaseAdapter(int resId, ArrayList<T> data) {
        this.layoutResId = resId;
        this.mData = data;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(layoutResId, parent, false);
        return new BaseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        onBindViewHolder(holder, mData, position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public abstract void onBindViewHolder(BaseViewHolder holder, ArrayList<T> data, int position);
}
