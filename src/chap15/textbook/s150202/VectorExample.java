package chap15.textbook.s150202;

import java.util.*;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		for (int i=1; i<6; i++) {
			list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
		}
		
		list.remove(2);
		list.remove(3);
		
		for(int a=0;a<list.size();a++) {
			Board board = list.get(a);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}
