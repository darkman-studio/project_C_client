package studio.darkman.golla.adapter;

import studio.darkman.golla.R;
import studio.darkman.golla.object.GollaPost;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class GollaListViewAdapter extends ArrayAdapter<GollaPost>{

	LayoutInflater inflater = null;
	public GollaListViewAdapter(Context context, int resource) {
		super(context, resource);
		inflater = LayoutInflater.from(context);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.list_item_post, parent);
		}
		// TODO Auto-generated method stub
		return super.getView(position, convertView, parent);
	}
}
