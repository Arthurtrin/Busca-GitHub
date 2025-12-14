package br.com.GithubSearchs.models;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Service class responsible for communicating with the GitHub API.
 *
 * <p>This class provides methods to:</p>
 * <ul>
 *   <li>Send HTTP requests to the GitHub API to retrieve user data</li>
 *   <li>Convert JSON responses into Java objects</li>
 * </ul>
 *
 * <p>The class uses {@link HttpClient} to perform HTTP requests and
 * {@link Gson} to handle JSON deserialization.</p>
 */

public class GithubService {
    /**
     * Shared {@link HttpClient} instance used to perform HTTP requests.
     */
    private static final HttpClient client = HttpClient.newHttpClient();

    /**
     * Sends a request to the GitHub API to search for a user by username.
     *
     * @param userName the GitHub username to be searched
     * @return a {@link String} containing the JSON response from the GitHub API
     * @throws IOException if an I/O error occurs while sending the request
     * @throws InterruptedException if the HTTP request is interrupted
     */
    public static String userSearch(String userName) throws IOException, InterruptedException {
        String search = "https://api.github.com/users/" + userName;
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(search)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    /**
     * Converts a JSON string into a {@link GithubSearch} object.
     *
     * @param json the JSON string returned by the GitHub API
     * @return a {@link GithubSearch} object populated with the parsed data
     */
    public static GithubSearch jsonToGithubUser(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, GithubSearch.class);
    }

}
