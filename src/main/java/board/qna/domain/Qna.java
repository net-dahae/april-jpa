package board.qna.domain;

import java.io.Serializable;
import java.util.Date;

public class Qna implements Serializable
{
	private static final long serialVersionUID = 6277759750586353968L;

	/**
	 * 번호
	 */
	private int seq;
	
	/**
	 * 질문 내용
	 */
	private String qcontent;
	
	/**
	 * 질문 일시
	 */
	private Date qdate;
	
	/**
	 * 답변 등록자
	 */
	private String aid;
	
	/**
	 * 댑변 내용
	 */
	private String acontent;

	/**
	 * 답변 일시
	 */
	private Date adate;
	
	/**
	 * 소요 시간
	 */
	private int turnaroundTime;
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public Date getQdate() {
		return qdate;
	}

	public void setQdate(Date qdate) {
		this.qdate = qdate;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getAcontent() {
		return acontent;
	}

	public void setAcontent(String acontent) {
		this.acontent = acontent;
	}

	public Date getAdate() {
		return adate;
	}

	public void setAdate(Date adate) {
		this.adate = adate;
	}
	
	public int getTurnaroundTime() {
		return turnaroundTime;
	}

	public void setTurnaroundTime(int turnaroundTime) {
		this.turnaroundTime = turnaroundTime;
	}

	public boolean isAnswer() {
		return String.valueOf(acontent).isEmpty() ? false : true;
	}
}
