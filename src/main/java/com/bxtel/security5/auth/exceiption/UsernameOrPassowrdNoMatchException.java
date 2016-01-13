package com.bxtel.security5.auth.exceiption;

/**
 * Thrown if an {@link UserDetailsService} implementation cannot locate a {@link User} by its username.
 *
 * @author Ben Alex
 */
public class UsernameOrPassowrdNoMatchException extends AuthenticationException {
    //~ Constructors ===================================================================================================

    /**
     * Constructs a <code>UsernameNotFoundException</code> with the specified
     * message.
     *
     * @param msg the detail message.
     */
    public UsernameOrPassowrdNoMatchException(String msg) {
        super(msg);
    }

    /**
     * Constructs a {@code UsernameNotFoundException} with the specified message and root cause.
     *
     * @param msg the detail message.
     * @param t root cause
     */
    public UsernameOrPassowrdNoMatchException(String msg, Throwable t) {
        super(msg, t);
    }
}