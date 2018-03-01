package lesson14;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestTrelloApi {

    @Test
    public void testGetBoardList() throws IOException{
        TrelloApiNew trelloApiNew = new TrelloApiNew();
        String boardList = trelloApiNew.getBoardList("SHlWKzb8");
        System.out.println(boardList);
    }

    @Test
    public void getLabelList() throws IOException{
        TrelloApiNew trelloApiNew = new TrelloApiNew();
        String boardList = trelloApiNew.getBoardList("SHlWKzb8");
        System.out.println(boardList);

    }
}
