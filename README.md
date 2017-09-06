# RecyclerViewAdapter
一行代码的万能的适配器（完成一个列表只需一行代码）
看看 实现代码：<br>
###第一种方法：
```
recyclerView.setAdapter(new BaseAdapter<ItemBean>(R.layout.layout_item,data) {
            @Override
            public void onBindViewHolder(BaseViewHolder holder, ArrayList<ItemBean> data, int position) {
                ((TextView)holder.getView(R.id.tvName)).setText(data.get(position).name);
                ((ImageView)holder.getView(R.id.img)).setImageResource(data.get(position).resId);
            }
        });
```      
       
###第二种方法：
```
recyclerView.setAdapter(new BaseAdapter<ItemBean>(R.layout.layout_item,data){

            @Override
            public void onBindViewHolder(BaseViewHolder holder, ArrayList<ItemBean> data, int position) {
                holder.setText(R.id.tvName,data.get(position).name).setImage(R.id.img,data.get(position).resId);
        }
        });
```
