package com.lilas.githubviewer.dto.commits;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OwnerDTO {
    @JsonProperty("login")
    private String login;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("type")
    private String type;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("gravatar_id")
    private String gravatarId;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("followers_url")
    private String followersUrl;
    @JsonProperty("following_url")
    private String followingUrl;
    @JsonProperty("gists_url")
    private String gistsUrl;
    @JsonProperty("starred_url")
    private String starredUrl;
    @JsonProperty("subscriptions_url")
    private String subscriptionsUrl;
    @JsonProperty("organizations_url")
    private String organizationsUrl;
    @JsonProperty("repos_url")
    private String reposUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("received_events_url")
    private String receivedEventsUrl;
    @JsonProperty("site_admin")
    private boolean siteAdmin;
}
