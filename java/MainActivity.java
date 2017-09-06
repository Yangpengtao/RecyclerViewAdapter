package shain.ypt.com.recyclerviewadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import shain.ypt.com.recyclerviewadapter.B2.BaseAdapter;
import shain.ypt.com.recyclerviewadapter.B2.BaseViewHolder;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<ItemBean> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            ItemBean item = new ItemBean();
            item.name = "测试" + i;
            data.add(item);
        }

        /*recyclerView.setAdapter(new BaseAdapter<ItemBean>(R.layout.layout_item,data) {
            @Override
            public void onBindViewHolder(BaseViewHolder holder, ArrayList<ItemBean> data, int position) {
                ((TextView)holder.getView(R.id.tvName)).setText(data.get(position).name);
                ((ImageView)holder.getView(R.id.img)).setImageResource(data.get(position).resId);
            }
        });*/
        recyclerView.setAdapter(new BaseAdapter<ItemBean>(R.layout.layout_item,data){

            @Override
            public void onBindViewHolder(BaseViewHolder holder, ArrayList<ItemBean> data, int position) {
                holder.setText(R.id.tvName,data.get(position).name).setImage(R.id.img,data.get(position).resId);
        }
        });

    }

}
