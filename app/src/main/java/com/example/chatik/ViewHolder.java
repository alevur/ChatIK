package com.example.chatik;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView message;

    public ViewHolder(View itemView) {
        super(itemView);
        message = itemView.findViewById(R.id.message_item);
    }

}
