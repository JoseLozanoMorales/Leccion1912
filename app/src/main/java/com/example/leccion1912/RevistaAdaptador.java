package com.example.leccion1912;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RevistaAdaptador extends ArrayAdapter<Revista> {

    public RevistaAdaptador(Context context, ArrayList<Revista> datos) {
        super(context, R.layout.lyitem, datos);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lyitem, null);

        TextView lblFecha = (TextView)item.findViewById(R.id.lblFecha);
        lblFecha.setText(getItem(position).getFecha());

        TextView lblLink = (TextView)item.findViewById(R.id.lblLink);
        lblLink.setText(getItem(position).getEnlace());

        ImageView imageView = (ImageView)item.findViewById(R.id.imgRevista);
        Glide.with(this.getContext()).load(getItem(position).getPortada()).into(imageView);

        return(item);

    }
}
