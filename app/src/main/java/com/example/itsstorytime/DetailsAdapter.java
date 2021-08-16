package com.example.itsstorytime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DetailsAdapter extends ArrayAdapter<Details> {
    private Context mContext;
    private int mResource;
    
    public DetailsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Details> objects) {
        super(context, resource, objects);
        this.mContext = mContext;
        this.mResource = mResource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource, parent, false);

        ImageView imageView = convertView.findViewById(R.id.list_image);
        TextView txtName = convertView.findViewById(R.id.item_name);
        TextView txtDesc = convertView.findViewById(R.id.item_sub_name);

        imageView.setImageResource(getItem(position).getImage());
        txtName.setText(getItem(position).getName());
        txtDesc.setText(getItem(position).getDesc());

        return convertView;
    }
}
