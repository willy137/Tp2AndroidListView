package com.example.listainmuebles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListaAdapter extends ArrayAdapter<Inmueble> {

    private LayoutInflater inflater;

    private Context context;

    private List<Inmueble> inmuebles;

    public ListaAdapter(@NonNull Context context, int resource, @NonNull List<Inmueble> objects, LayoutInflater inflater) {
        super(context, resource, objects);
        this.context=context;
        this.inmuebles=objects;
        this.inflater=inflater;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView=convertView;
        if(itemView==null){
            itemView=inflater.inflate(R.layout.item,parent,false);
        }
        Inmueble inmueble=inmuebles.get(position);
        ImageView foto=itemView.findViewById(R.id.imFoto);
        foto.setImageResource(inmueble.getFoto());
        TextView t1=itemView.findViewById(R.id.tvDireccion);
        t1.setText(inmueble.getDireccion());
        TextView t2=itemView.findViewById(R.id.tvPrecio);
        t2.setText(inmueble.getPrecio()+"");
        return itemView;
    }
}
