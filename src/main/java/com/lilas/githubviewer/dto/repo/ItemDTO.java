package com.lilas.githubviewer.dto.repo;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.lilas.githubviewer.dto.commits.LicenseDTO;
import com.lilas.githubviewer.dto.commits.OwnerDTO;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemDTO {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("url")
    private String url;
    @JsonProperty("owner")
    private OwnerDTO ownerDTO;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("fork")
    private String fork;
    @JsonProperty("forks_url")
    private String forksUrl;
    @JsonProperty("keys_url")
    private String keysUrl;
    @JsonProperty("collaborators_url")
    private String collaboratorsUrl;
    @JsonProperty("teams_url")
    private String teamsUrl;
    @JsonProperty("hooks_url")
    private String hooksUrl;
    @JsonProperty("issue_events_url")
    private String issueEventsUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("assignees_url")
    private String assigneesUrl;
    @JsonProperty("branches_url")
    private String branchesUrl;
    @JsonProperty("tags_url")
    private String tagsUrl;
    @JsonProperty("blobs_url")
    private String blobsUrl;
    @JsonProperty("git_tags_url")
    private String gitTagsUrl;
    @JsonProperty("git_refs_url")
    private String gitRefsUrl;
    @JsonProperty("trees_url")
    private String treesUrl;
    @JsonProperty("statuses_url")
    private String statusesUrl;
    @JsonProperty("languages_url")
    private String languagesUrl;
    @JsonProperty("stargazers_url")
    private String stargazersUrl;
    @JsonProperty("contributors_url")
    private String contributorsUrl;
    @JsonProperty("subscribers_url")
    private String subscribersUrl;
    @JsonProperty("subscription_url")
    private String subscriptionUrl;
    @JsonProperty("commits_url")
    private String commitsUrl;
    @JsonProperty("git_commits_url")
    private String gitCommitsUrl;
    @JsonProperty("comments_url")
    private String commentsUrl;
    @JsonProperty("issue_comment_url")
    private String issueCommentUrl;
    @JsonProperty("contents_url")
    private String contentsUrl;
    @JsonProperty("compare_url")
    private String compareUrl;
    @JsonProperty("merges_url")
    private String mergesUrl;
    @JsonProperty("archive_url")
    private String archiveUrl;
    @JsonProperty("downloads_url")
    private String downloadsUrl;
    @JsonProperty("issues_url")
    private String issuesUrl;
    @JsonProperty("pulls_url")
    private String pullsUrl;
    @JsonProperty("milestones_url")
    private String milestonesUrl;
    @JsonProperty("notifications_url")
    private String notificationsUrl;
    @JsonProperty("labels_url")
    private String labelsUrl;
    @JsonProperty("releases_url")
    private String releasesUrl;
    @JsonProperty("deployments_url")
    private String deploymentsUrl;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("pushed_at")
    private String pushedAt;
    @JsonProperty("git_url")
    private String gitUrl;
    @JsonProperty("ssh_url")
    private String sshUrl;
    @JsonProperty("clone_url")
    private String cloneUrl;
    @JsonProperty("svn_url")
    private String svnUrl;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("size")
    private String size;
    @JsonProperty("stargazers_count")
    private String stargazersCount;
    @JsonProperty("watchers_count")
    private String watchersCount;
    @JsonProperty("language")
    private String language;
    @JsonProperty("has_issues")
    private boolean hasIssues;
    @JsonProperty("has_projects")
    private boolean hasProjects;
    @JsonProperty("has_downloads")
    private boolean hasDownloads;
    @JsonProperty("has_wiki")
    private boolean hasWiki;
    @JsonProperty("has_pages")
    private String hasPages;
    @JsonProperty("forks_count")
    private int forksCount;
    @JsonProperty("mirror_url")
    private String mirrorUrl;
    @JsonProperty("archived")
    private boolean archived;
    @JsonProperty("disabled")
    private boolean disabled;
    @JsonProperty("open_issues_count")
    private int openIssuesCount;
    @JsonProperty("license")
    private LicenseDTO licenseDTO;
    @JsonProperty("forkc")
    private int forks;
    @JsonProperty("open_issues")
    private int openIssues;
    @JsonProperty("watchers")
    private int watchers;
    @JsonProperty("default_branch")
    private String defaultBranch;
    @JsonProperty("score")
    private double score;

    public String getDescription() {
        return description == null ? "Empty Message" : description;
    }
}
