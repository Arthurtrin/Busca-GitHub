package br.com.GithubSearchs.exceptions;

/**
 * Exception thrown when a GitHub user cannot be found.
 *
 * <p>This exception is used to indicate that a requested user does not exist
 * or that the GitHub API did not return valid user data.</p>
 *
 * <p>It extends {@link RuntimeException}, allowing it to be thrown
 * without mandatory try-catch blocks.</p>
 */
public class UserNotFound extends RuntimeException {
    private String message;

    /**
     * Creates a new {@code UserNotFound} exception with a custom message.
     *
     * @param message a descriptive message explaining the cause of the exception
     */
    public UserNotFound(String message) {
        this.message = message;
    }

    /**
     * Returns the detail message of this exception.
     *
     * @return the exception message
     */
    @Override
    public String getMessage() {
        return this.message;
    }
}
