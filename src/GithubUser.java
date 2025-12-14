import java.util.Objects;

public class GithubUser {
    private String userName, name, bio;
    private int followers, following;

    public GithubUser(GithubSearch githubSearch) {
        if (githubSearch.login() == null){
            throw new UserNotFound("Usuario não encontrado.");
        }
        this.userName = githubSearch.login();
        this.name = githubSearch.name();
        this.bio = githubSearch.bio();
        this.followers = githubSearch.followers();
        this.following = githubSearch.following();
    }

    @Override
    public String toString() {
        return "Nome: " + this.name +
                "\nBio: " + this.bio +
                "\nSeguidores: " + this.followers +
                "\nSeguindo: " + this.following;
    }
}
