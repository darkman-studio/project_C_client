package studio.darkman.golla.customview;

import studio.darkman.golla.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.googlecode.androidannotations.annotations.EViewGroup;
import com.googlecode.androidannotations.annotations.ViewById;

@EViewGroup(R.layout.view_votable_image_view)
public class VotableImageView extends RelativeLayout {
	
	@ViewById
	private VoteButtonView btnVote;
	
	@ViewById
	private ImageView mainImage;

	public VotableImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public void setImageOnClickListener(OnClickListener listener) {
		mainImage.setOnClickListener(listener);
	}
	
	public void setVoteOnclickListener(OnClickListener listener) {
		btnVote.setOnClickListener(listener);
	}
}
