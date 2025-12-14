import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner read = new Scanner(System.in);
        String userName, search, json;
        System.out.print("digite o nome do usuario: ");
        userName = read.nextLine();
        search = "https://api.github.com/users/" + userName;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(search)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        json = response.body();
        Gson gson = new Gson();
        GithubSearch githubSearch = gson.fromJson(json, GithubSearch.class);
        try{
            GithubUser githubUser = new GithubUser(githubSearch);
            System.out.println(githubUser);
        }
        catch(UserNotFound e){
            System.out.println(e.getMessage());
        }

    }


}