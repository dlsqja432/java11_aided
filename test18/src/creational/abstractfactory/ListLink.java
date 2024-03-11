package creational.abstractfactory;

public class ListLink extends Link {
	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<a herf=\"" + url + "\">" + caption + "</a>";
	}
}
