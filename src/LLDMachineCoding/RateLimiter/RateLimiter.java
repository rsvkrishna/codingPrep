package LLDMachineCoding.RateLimiter;

public interface RateLimiter {
    boolean allowRequest(String clientId);
}

