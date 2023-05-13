package fr.ucaolan.xmen;


import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fr.ucaolan.xmen.databinding.XMenBinding;

public class XMenViewHolder extends RecyclerView.ViewHolder
{
    private final XMenBinding ui;

    private XMenAdapter.OnItemClickListener onItemClickListener;


    public XMenViewHolder(@NonNull XMenBinding ui) {
        super(ui.getRoot());
        this.ui = ui;
//        ui.itemView.setOnClickListener(this::onClick);
    }

    public void setXMen(XMen xmen)
    {
        ui.xMenName.setText(xmen.getNom());
        ui.xMenAlias.setText(xmen.getAlias());
        ui.xMenDesc.setText(xmen.getDescription());
        ui.xMenPwr.setText(xmen.getPouvoirs());
        ui.xMenImage.setImageResource(xmen.getIdImage());

    }

    public void setOnItemClickListener(XMenAdapter.OnItemClickListener onItemClickListener)
    {
        this.onItemClickListener = onItemClickListener;
    }

    private void onClick(View v)
    {
        if(onItemClickListener != null)
        {
            onItemClickListener.onItemClick(getAdapterPosition());
        }
    }
}
