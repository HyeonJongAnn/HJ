package chap09_inherit.board;

public abstract class Board {
	int boardNo;
	String boardTitle;
	String boardContent;
	String boardWriter;
	String boardDate;
	
	public Board() {
		
	}

	public Board(int boardNo, String boardTitle, String boardContent, String boardWriter, String boardDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	
	//자식 클래스에서 사용할 수 있도록
	//부모에 껍데기만 형성해놓는 작업(추상화:abstract)
	public abstract void insertBoard(); 
		
	
	
	
	
	
	
	
}