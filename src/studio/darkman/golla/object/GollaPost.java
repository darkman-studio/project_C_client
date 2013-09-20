package studio.darkman.golla.object;

public class GollaPost {
	public static final int POST_TYPE_VOTE = 0;
	public static final int POST_TYPE_VOTED = 1;
	
	public String ip;
	
	public int getPostType() {
		return POST_TYPE_VOTE;
	}
}
