package LLDMachineCoding.RateLimiter;

import java.util.HashMap;
import java.util.Map;

public class FixedWindowRateLimiterWithTemplate extends AbstractRateLimiter {
    private Map<String, Integer> requestCounts;
    private Map<String, Long> windowStartTimes;

    public FixedWindowRateLimiterWithTemplate(int maxRequests, long windowSizeInMillis) {
        super(maxRequests, windowSizeInMillis);
        this.requestCounts = new HashMap<>();
        this.windowStartTimes = new HashMap<>();
    }

    @Override
    protected boolean isRequestAllowed(String clientId) {
        long currentTime = System.currentTimeMillis();
        windowStartTimes.putIfAbsent(clientId, currentTime);
        requestCounts.putIfAbsent(clientId, 0);

        long windowStartTime = windowStartTimes.get(clientId);
        if (currentTime - windowStartTime >= windowSizeInMillis) {
            windowStartTimes.put(clientId, currentTime);
            requestCounts.put(clientId, 0);
        }

        int requestCount = requestCounts.get(clientId);
        if (requestCount < maxRequests) {
            requestCounts.put(clientId, requestCount + 1);
            return true;
        }
        return false;
    }
}
