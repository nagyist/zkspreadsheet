package org.zkoss.zss.ngmodel.impl;

import org.zkoss.zss.ngmodel.NRichText;

public class CommentImpl extends CommentAdv {
	private static final long serialVersionUID = 1L;
	private Object text;
	private String author;
	
	@Override
	public String getText() {
		return text instanceof String?(String)text:null;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void setRichText(NRichText text) {
		this.text = text;
	}

	@Override
	public NRichText setRichText() {
		this.text = new RichTextImpl();
		return (NRichText)this.text;
	}

	@Override
	public NRichText getRichText() {
		return text instanceof NRichText?(NRichText)text:null;
	}

	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public void setAuthor(String author) {
		this.author = author;
	}

}
