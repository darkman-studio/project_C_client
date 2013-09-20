package studio.darkman.golla.adapter;

import studio.darkman.golla.R;
import studio.darkman.golla.object.GollaPost;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class GollaListViewAdapter extends ArrayAdapter<GollaPost>{
    private LayoutInflater mInflater;

    public GollaListViewAdapter(Context context, int resource) {
		super(context, resource);
		mInflater = LayoutInflater.from(context);
	}
	
	@Override
	public int getItemViewType(int position) {
		GollaPost item = getItem(position);
		return item.getPostType();
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.list_item_post, parent);
		}

		int type = getItemViewType(position);
		switch (type) {
		case GollaPost.POST_TYPE_VOTE:
			break;

		case GollaPost.POST_TYPE_VOTED:
			break;

		default:
			break;
		}
		return super.getView(position, convertView, parent);
	}
}
