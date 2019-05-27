package com.vasa.nasayeb;

import android.view.View;
import android.widget.TextView;

import de.blox.graphview.ViewHolder;

class SimpleViewHolder extends ViewHolder {
    TextView textView;

    public SimpleViewHolder(View view) {
        super(view);
        textView = view.findViewById(R.id.textView);
    }
}
