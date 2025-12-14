package br.com.GithubSearchs.models;


/**
 * Represents a GitHub user returned by the GitHub API.
 *
 * <p>This record acts as a data transfer object (DTO), holding
 * basic public information about a GitHub user.</p>
 *
 * @param login the user's GitHub username
 * @param name the user's full name
 * @param bio the user's biography
 * @param followers the number of followers the user has
 * @param following the number of users the user is following
 */
public record GithubSearch(String login,
                           String name,
                           String bio,
                           int followers,
                           int following) { }
