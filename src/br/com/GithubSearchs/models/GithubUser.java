package br.com.GithubSearchs.models;

import br.com.GithubSearchs.exceptions.UserNotFound;
/**
 * Represents a GitHub user within the application domain.
 *
 * <p>This class acts as a domain model that validates and encapsulates
 * user data obtained from the GitHub API.</p>
 *
 * <p>If the provided {@link GithubSearch} object does not contain a valid
 * username, a {@link UserNotFound} exception is thrown.</p>
 */
public class GithubUser {
    private String userName, name, bio;
    private int followers, following;

    /**
     * Creates a {@code GithubUser} instance based on a {@link GithubSearch} object.
     *
     * <p>This constructor validates whether the user exists by checking
     * if the {@code login} field is present. If not, a
     * {@link UserNotFound} exception is thrown.</p>
     *
     * @param githubSearch the data object returned from the GitHub API
     * @throws UserNotFound if the user does not exist or was not found
     */

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

    /**
     * Returns a formatted string representation of the GitHub user.
     *
     * @return a human-readable representation of the user information
     */

    @Override
    public String toString() {
        return "Nome: " + this.name +
                "\nBio: " + this.bio +
                "\nSeguidores: " + this.followers +
                "\nSeguindo: " + this.following;
    }
}
