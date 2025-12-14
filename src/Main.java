import br.com.GithubSearchs.models.GithubService;
import br.com.GithubSearchs.models.GithubUser;
import br.com.GithubSearchs.exceptions.UserNotFound;
import java.io.IOException;

/**
 * Example of how to use the GitHub Search application.
 *
 * <p>This example demonstrates how to:</p>
 * <ul>
 *   <li>Request user data from the GitHub API using {@link GithubService}</li>
 *   <li>Convert the returned JSON into a {@link GithubUser} object</li>
 *   <li>Handle the {@link UserNotFound} exception when the user does not exist</li>
 * </ul>
 *
 * <p>If the requested user is not found, the application throws a
 * {@link UserNotFound} exception.</p>
 */

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String json = GithubService.userSearch("Arthurtrin");
        try{
            GithubUser githubUser = new GithubUser(GithubService.jsonToGithubUser(json));
            System.out.println(githubUser);
        }
        catch(UserNotFound e){
            System.out.println(e.getMessage());
        }

    }

}