package org.citraemu.citra.adapter;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.citraemu.citra.R;
import org.citraemu.citra.bean.Game;

import java.util.List;

public class GameListAdapter extends BaseAdapter {

    private Context context;
    private List<Game> items;

    public GameListAdapter(Context context, List<Game> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    @Override
    public Object getItem(int position) {
        return this.items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if (convertView == null) {
            // Create a new view into the list.
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.game_list_item, parent, false);
        }

        // Set data into the view.
        ImageView ivItem = (ImageView) rowView.findViewById(R.id.game_icon);
        TextView tvTitle = (TextView) rowView.findViewById(R.id.game_title);
        TextView tvSize = (TextView) rowView.findViewById(R.id.game_size);

        Game item = this.items.get(position);
        tvTitle.setText(item.getTitle());
        tvSize.setText(Double.toString(item.getSize()));
        ivItem.setImageDrawable(item.getImage());

        return rowView;
    }

}