package lesson14;

import okhttp3.*;

import java.io.IOException;

public class TrelloApiNew extends TrelloApi {

    OkHttpClient client = new OkHttpClient();

    public String post(String url, String json) throws IOException {

        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json);
        Request request = new Request.Builder().url(url).post(body).build();
        Response response = client.newCall(request).execute();
        return response.body().string();

    }

    public String get(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public String getBoardList(String boardId) throws IOException{
        String url =  "https://api.trello.com/1/boards/"+boardId+"/lists?cards=all&key="+KEY+"&token="+TOKEN;
        String response = get(url);
        return response;


    }

    public String getLabelList(String boardId) throws IOException{
        String url =  "https://api.trello.com/1/boards/"+boardId+"/labels?cards=all&key="+KEY+"&token="+TOKEN+"&limit=3&fields=color";
        String response = get(url);
        return response;
    }
}
