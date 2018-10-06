@groovy.transform.ToString()
class Tweet {
    String fullName
    String messageMain
    Integer retweets
    Integer favorites
    Date createdOn
    
    public Tweet(String user, String tweet) {
        fullName = user
        messageMain = tweet
        retweets = 0
        favorites = 0
        createdOn = new Date()
    }
    
    void addToRetweets() {
        retweets += 1
    }
    
    void addToFavorites() {
        favorites += 1
    }
    
    void tweetInfo() {
        println "${fullName} sent message: ${messageMain}"
    }
}