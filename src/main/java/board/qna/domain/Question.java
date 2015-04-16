package board.qna.domain;

import java.util.List;

import board.domain.BoardBaseEntity;

public class Question extends BoardBaseEntity
{
	private static final long serialVersionUID = 8182320036737210644L;
	
	/**
	 * 제목
	 */
	private String title;
	
	/**
	 * 조회수
	 */
	private int hits;
	
	/**
	 * 질문 답변 목록
	 */
	private List<Qna> qnaList;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public List<Qna> getQnaList() {
		return qnaList;
	}

	public void setQnaList(List<Qna> qnaList) {
		this.qnaList = qnaList;
	}

	public boolean isAnswerCheck() {
		
		int tcount = getQnaList().size();
		int ccount = 0;
		
		for (Qna qna : getQnaList())
		{
			if ( qna.isAnswer() ) ccount++;
		}
		
		return tcount == ccount ? true : false;
	}
}
