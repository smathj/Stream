package IO.supporter;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Board implements Serializable {
	
	private int bno;
	private String title;
	private String contetnt;
	private String writer;
	private Date date;
	
	
	public Board(int bno, String title, String content, String writer, Date date) {
		this.bno = bno;
		this.title = title;
		this.contetnt = content;
		this.writer = writer;
		this.date = date;
	}
	

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContetnt() {
		return contetnt;
	}

	public void setContetnt(String contetnt) {
		this.contetnt = contetnt;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
