package au.com.moziauddin

class Tweet {
    String post
    String username
    Date postDateTime
    private List favorites = []
    private List retweets = []
    private List mentions = []
    private List hashtags = []

}

Tweet tweet = new Tweet()