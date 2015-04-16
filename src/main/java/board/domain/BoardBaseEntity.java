package board.domain;

import java.io.Serializable;
import java.util.Date;

public class BoardBaseEntity implements Serializable
{
	/**
	 * 번호
	 */
	private int seq;
	
	/**
	 * 등록일시
	 */
	private Date wdate;
	
	/**
	 * 등록자 아이디
	 */
	private String wid;
	
	/**
	 * 등록자 이름
	 */
	private String wnm;
	
	/**
	 * 수정일시
	 */
	private Date edate;
	
	/**
	 * 수정자 아이디
	 */
	private String eid;
	
	/**
	 * 수정자 이름
	 */
	private String enm;
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public Date getWdate() {
		return wdate;
	}

	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}

	public String getWid() {
		return wid;
	}

	public void setWid(String wid) {
		this.wid = wid;
	}

	public String getWnm() {
		return wnm;
	}

	public void setWnm(String wnm) {
		this.wnm = wnm;
	}

	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEnm() {
		return enm;
	}

	public void setEnm(String enm) {
		this.enm = enm;
	}
}
