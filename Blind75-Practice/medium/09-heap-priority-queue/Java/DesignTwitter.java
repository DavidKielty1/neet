/*
 * 355. Design Twitter
 * Difficulty: Medium
 * Pattern: Heap / Design
 *
 * Problem:
 * Design a simplified version of Twitter where users can post tweets, follow and
 * unfollow other users, and retrieve the 10 most recent tweet ids in their news
 * feed.
 *
 * Implement the `Twitter` class:
 * - `Twitter()` initializes your Twitter object.
 * - `void postTweet(int userId, int tweetId)` composes a new tweet with id
 *   `tweetId` by the user `userId`. Each call uses a unique tweet id.
 * - `List<Integer> getNewsFeed(int userId)` returns the 10 most recent tweet ids
 *   in the user's news feed. Each item in the news feed must be posted by users
 *   whom the user followed or by the user themself. Tweets must be ordered from
 *   most recent to least recent.
 * - `void follow(int followerId, int followeeId)` makes the user `followerId`
 *   follow the user `followeeId`.
 * - `void unfollow(int followerId, int followeeId)` makes the user `followerId`
 *   unfollow the user `followeeId`.
 *
 * Example 1:
 * Input:
 * ["Twitter","postTweet","getNewsFeed","follow","postTweet","getNewsFeed",
 *  "unfollow","getNewsFeed"]
 * [[],[1,5],[1],[1,2],[2,6],[1],[1,2],[1]]
 * Output:
 * [null,null,[5],null,null,[6,5],null,[5]]
 * Explanation:
 * User 1 posts tweet 5. Their feed is [5]. After following user 2 and user 2
 * posting tweet 6, user 1 sees [6,5]. After unfollowing user 2, the feed goes
 * back to [5].
 *
 * Example 2:
 * Input:
 * ["Twitter","postTweet","postTweet","getNewsFeed"]
 * [[],[1,100],[1,101],[1]]
 * Output:
 * [null,null,null,[101,100]]
 *
 * Constraints:
 * - 1 <= userId, followerId, followeeId <= 500
 * - 0 <= tweetId <= 10^4
 * - All the tweets have unique ids.
 * - At most 3 * 10^4 calls will be made to `postTweet`, `getNewsFeed`,
 *   `follow`, and `unfollow`.
 * - A user cannot follow themself in the official problem behavior.
 *
 * Notes:
 * - This is usually modeled with adjacency sets plus per-user tweet history.
 * - A max-heap is helpful for merging the newest tweets from followed users.
 */

import java.util.List;

public class DesignTwitter {
    static class Twitter {
        public Twitter() {
        }
        
        public void postTweet(int userId, int id) {
            
        }
        
        public List<Integer> getNewsFeed(int userId) {
            
        }
        
        public void follow(int followerId, int followeeId) {
            
        }
        
        public void unfollow(int followerId, int followeeId) {
            
        }
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // private static final int MAX_FEED = 10;
            // private int time = 0;
            // Map<Integer, Set<Integer>> followeesByUser = new HashMap<>();
            // Map<Integer, List<Tweet>> tweetsByUser = new HashMap<>();
    
            // public Twitter() {
            // }
            
            // public void postTweet(int userId, int tweetId) {
            //     ensureUser(userId);
            //     tweetsByUser.get(userId).add(new Tweet(tweetid, time++));
            // }
            
            // public List<Integer> getNewsFeed(int userId) {
            //     ensureUser(userId);
            //     PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b)
            //                     -> Integer.compare(b[0], a[0]));
            //     for (int followeeId : followeesByUser.get(userId)) {
            //         List<Tweet> tweets = tweetsByUser.get(followeeId);
            //         if (tweets.isEmpty()) continue;
            //         Tweet tweet = tweets.getLast();
            //         maxHeap.offer(new int[] {tweet.time(), tweet.id(), tweets.size() - 1, followeeId});
            //     }
    
            //     List<Integer> feed = new ArrayList<>();
            //     while (!maxHeap.isEmpty() && feed.size() < MAX_FEED) {
            //         int[] latest = maxHeap.poll();
            //         feed.add(latest[1]);
            //         if (--latest[2] >= 0) {
            //             Tweet previous = tweetsByUser.get(latest[3]).get(latest[2]);
            //             maxHeap.offer(new int[] {previous.time(), previous.id(), latest[2], latest[3]});
            //         }
            //     }
            //     return feed;
            // }
            
            // public void follow(int followerId, int followeeId) {
            //     ensureUser(followerId);
            //     ensureUser(followeeId);
            //     if (followeeId != followerId) {
            //         followeesByUser.get(followerId).add(followeeId);
            //     }
                
            // }
            
            // public void unfollow(int followerId, int followeeId) {
            //     ensureUser(followerId);
            //     if (followeeId != followerId) {
            //         followeesByUser.get(followerId).remove(followeeId);
            //     }
            // }
    
            // private void ensureUser (int userId) {
            //     followeesByUser.computeIfAbsent(userId, key ->
            //         Set<Integer> set = new HashSet<>();
            //         set.add(userId);
            //         return set;
            //     )
            //     tweetsByUser.computeIfAbsent(userId, key -> new ArrayList<>());
            // }
    
            // private record tweet(int id, int time);
        }

    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5);
        System.out.println("DesignTwitter practice stub ready.");
    }
}
