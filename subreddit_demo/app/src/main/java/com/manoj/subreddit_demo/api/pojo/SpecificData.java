package com.manoj.subreddit_demo.api.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SpecificData {
    @SerializedName("user_flair_background_color")
    @Expose
    private Object userFlairBackgroundColor;
    @SerializedName("submit_text_html")
    @Expose
    private String submitTextHtml;
    @SerializedName("restrict_posting")
    @Expose
    private Boolean restrictPosting;
    @SerializedName("user_is_banned")
    @Expose
    private Object userIsBanned;
    @SerializedName("free_form_reports")
    @Expose
    private Boolean freeFormReports;
    @SerializedName("wiki_enabled")
    @Expose
    private Boolean wikiEnabled;
    @SerializedName("user_is_muted")
    @Expose
    private Object userIsMuted;
    @SerializedName("user_can_flair_in_sr")
    @Expose
    private Object userCanFlairInSr;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("header_img")
    @Expose
    private String headerImg;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("icon_size")
    @Expose
    private List<Integer> iconSize = null;
    @SerializedName("primary_color")
    @Expose
    private String primaryColor;
    @SerializedName("active_user_count")
    @Expose
    private Object activeUserCount;
    @SerializedName("icon_img")
    @Expose
    private String iconImg;
    @SerializedName("display_name_prefixed")
    @Expose
    private String displayNamePrefixed;
    @SerializedName("accounts_active")
    @Expose
    private Object accountsActive;
    @SerializedName("public_traffic")
    @Expose
    private Boolean publicTraffic;
    @SerializedName("subscribers")
    @Expose
    private Integer subscribers;
    @SerializedName("user_flair_richtext")
    @Expose
    private List<Object> userFlairRichtext = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("quarantine")
    @Expose
    private Boolean quarantine;
    @SerializedName("hide_ads")
    @Expose
    private Boolean hideAds;
    @SerializedName("emojis_enabled")
    @Expose
    private Boolean emojisEnabled;
    @SerializedName("advertiser_category")
    @Expose
    private String advertiserCategory;
    @SerializedName("public_description")
    @Expose
    private String publicDescription;
    @SerializedName("comment_score_hide_mins")
    @Expose
    private Integer commentScoreHideMins;
    @SerializedName("user_has_favorited")
    @Expose
    private Object userHasFavorited;
    @SerializedName("user_flair_template_id")
    @Expose
    private Object userFlairTemplateId;
    @SerializedName("community_icon")
    @Expose
    private String communityIcon;
    @SerializedName("banner_background_image")
    @Expose
    private String bannerBackgroundImage;
    @SerializedName("original_content_tag_enabled")
    @Expose
    private Boolean originalContentTagEnabled;
    @SerializedName("submit_text")
    @Expose
    private String submitText;
    @SerializedName("description_html")
    @Expose
    private String descriptionHtml;
    @SerializedName("spoilers_enabled")
    @Expose
    private Boolean spoilersEnabled;
    @SerializedName("header_title")
    @Expose
    private String headerTitle;
    @SerializedName("header_size")
    @Expose
    private List<Integer> headerSize = null;
    @SerializedName("user_flair_position")
    @Expose
    private String userFlairPosition;
    @SerializedName("all_original_content")
    @Expose
    private Boolean allOriginalContent;
    @SerializedName("has_menu_widget")
    @Expose
    private Boolean hasMenuWidget;
    @SerializedName("is_enrolled_in_new_modmail")
    @Expose
    private Object isEnrolledInNewModmail;
    @SerializedName("key_color")
    @Expose
    private String keyColor;
    @SerializedName("can_assign_user_flair")
    @Expose
    private Boolean canAssignUserFlair;
    @SerializedName("created")
    @Expose
    private Double created;
    @SerializedName("wls")
    @Expose
    private Integer wls;
    @SerializedName("show_media_preview")
    @Expose
    private Boolean showMediaPreview;
    @SerializedName("submission_type")
    @Expose
    private String submissionType;
    @SerializedName("user_is_subscriber")
    @Expose
    private Object userIsSubscriber;
    @SerializedName("disable_contributor_requests")
    @Expose
    private Boolean disableContributorRequests;
    @SerializedName("allow_videogifs")
    @Expose
    private Boolean allowVideogifs;
    @SerializedName("user_flair_type")
    @Expose
    private String userFlairType;
    @SerializedName("collapse_deleted_comments")
    @Expose
    private Boolean collapseDeletedComments;
    @SerializedName("emojis_custom_size")
    @Expose
    private Object emojisCustomSize;
    @SerializedName("public_description_html")
    @Expose
    private String publicDescriptionHtml;
    @SerializedName("allow_videos")
    @Expose
    private Boolean allowVideos;
    @SerializedName("is_crosspostable_subreddit")
    @Expose
    private Boolean isCrosspostableSubreddit;
    @SerializedName("suggested_comment_sort")
    @Expose
    private Object suggestedCommentSort;
    @SerializedName("can_assign_link_flair")
    @Expose
    private Boolean canAssignLinkFlair;
    @SerializedName("accounts_active_is_fuzzed")
    @Expose
    private Boolean accountsActiveIsFuzzed;
    @SerializedName("submit_text_label")
    @Expose
    private String submitTextLabel;
    @SerializedName("link_flair_position")
    @Expose
    private String linkFlairPosition;
    @SerializedName("user_sr_flair_enabled")
    @Expose
    private Object userSrFlairEnabled;
    @SerializedName("user_flair_enabled_in_sr")
    @Expose
    private Boolean userFlairEnabledInSr;
    @SerializedName("allow_discovery")
    @Expose
    private Boolean allowDiscovery;
    @SerializedName("user_sr_theme_enabled")
    @Expose
    private Boolean userSrThemeEnabled;
    @SerializedName("link_flair_enabled")
    @Expose
    private Boolean linkFlairEnabled;
    @SerializedName("subreddit_type")
    @Expose
    private String subredditType;
    @SerializedName("notification_level")
    @Expose
    private Object notificationLevel;
    @SerializedName("banner_img")
    @Expose
    private String bannerImg;
    @SerializedName("user_flair_text")
    @Expose
    private Object userFlairText;
    @SerializedName("banner_background_color")
    @Expose
    private String bannerBackgroundColor;
    @SerializedName("show_media")
    @Expose
    private Boolean showMedia;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("user_is_contributor")
    @Expose
    private Object userIsContributor;
    @SerializedName("over18")
    @Expose
    private Boolean over18;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("submit_link_label")
    @Expose
    private String submitLinkLabel;
    @SerializedName("user_flair_text_color")
    @Expose
    private Object userFlairTextColor;
    @SerializedName("restrict_commenting")
    @Expose
    private Boolean restrictCommenting;
    @SerializedName("user_flair_css_class")
    @Expose
    private Object userFlairCssClass;
    @SerializedName("allow_images")
    @Expose
    private Boolean allowImages;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("whitelist_status")
    @Expose
    private String whitelistStatus;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("created_utc")
    @Expose
    private Double createdUtc;
    @SerializedName("banner_size")
    @Expose
    private List<Integer> bannerSize = null;
    @SerializedName("mobile_banner_image")
    @Expose
    private String mobileBannerImage;
    @SerializedName("user_is_moderator")
    @Expose
    private Object userIsModerator;

    public Object getUserFlairBackgroundColor() {
        return userFlairBackgroundColor;
    }

    public void setUserFlairBackgroundColor(Object userFlairBackgroundColor) {
        this.userFlairBackgroundColor = userFlairBackgroundColor;
    }

    public String getSubmitTextHtml() {
        return submitTextHtml;
    }

    public void setSubmitTextHtml(String submitTextHtml) {
        this.submitTextHtml = submitTextHtml;
    }

    public Boolean getRestrictPosting() {
        return restrictPosting;
    }

    public void setRestrictPosting(Boolean restrictPosting) {
        this.restrictPosting = restrictPosting;
    }

    public Object getUserIsBanned() {
        return userIsBanned;
    }

    public void setUserIsBanned(Object userIsBanned) {
        this.userIsBanned = userIsBanned;
    }

    public Boolean getFreeFormReports() {
        return freeFormReports;
    }

    public void setFreeFormReports(Boolean freeFormReports) {
        this.freeFormReports = freeFormReports;
    }

    public Boolean getWikiEnabled() {
        return wikiEnabled;
    }

    public void setWikiEnabled(Boolean wikiEnabled) {
        this.wikiEnabled = wikiEnabled;
    }

    public Object getUserIsMuted() {
        return userIsMuted;
    }

    public void setUserIsMuted(Object userIsMuted) {
        this.userIsMuted = userIsMuted;
    }

    public Object getUserCanFlairInSr() {
        return userCanFlairInSr;
    }

    public void setUserCanFlairInSr(Object userCanFlairInSr) {
        this.userCanFlairInSr = userCanFlairInSr;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getHeaderImg() {
        return headerImg;
    }

    public void setHeaderImg(String headerImg) {
        this.headerImg = headerImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getIconSize() {
        return iconSize;
    }

    public void setIconSize(List<Integer> iconSize) {
        this.iconSize = iconSize;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public Object getActiveUserCount() {
        return activeUserCount;
    }

    public void setActiveUserCount(Object activeUserCount) {
        this.activeUserCount = activeUserCount;
    }

    public String getIconImg() {
        return iconImg;
    }

    public void setIconImg(String iconImg) {
        this.iconImg = iconImg;
    }

    public String getDisplayNamePrefixed() {
        return displayNamePrefixed;
    }

    public void setDisplayNamePrefixed(String displayNamePrefixed) {
        this.displayNamePrefixed = displayNamePrefixed;
    }

    public Object getAccountsActive() {
        return accountsActive;
    }

    public void setAccountsActive(Object accountsActive) {
        this.accountsActive = accountsActive;
    }

    public Boolean getPublicTraffic() {
        return publicTraffic;
    }

    public void setPublicTraffic(Boolean publicTraffic) {
        this.publicTraffic = publicTraffic;
    }

    public Integer getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Integer subscribers) {
        this.subscribers = subscribers;
    }

    public List<Object> getUserFlairRichtext() {
        return userFlairRichtext;
    }

    public void setUserFlairRichtext(List<Object> userFlairRichtext) {
        this.userFlairRichtext = userFlairRichtext;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getQuarantine() {
        return quarantine;
    }

    public void setQuarantine(Boolean quarantine) {
        this.quarantine = quarantine;
    }

    public Boolean getHideAds() {
        return hideAds;
    }

    public void setHideAds(Boolean hideAds) {
        this.hideAds = hideAds;
    }

    public Boolean getEmojisEnabled() {
        return emojisEnabled;
    }

    public void setEmojisEnabled(Boolean emojisEnabled) {
        this.emojisEnabled = emojisEnabled;
    }

    public String getAdvertiserCategory() {
        return advertiserCategory;
    }

    public void setAdvertiserCategory(String advertiserCategory) {
        this.advertiserCategory = advertiserCategory;
    }

    public String getPublicDescription() {
        return publicDescription;
    }

    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
    }

    public Integer getCommentScoreHideMins() {
        return commentScoreHideMins;
    }

    public void setCommentScoreHideMins(Integer commentScoreHideMins) {
        this.commentScoreHideMins = commentScoreHideMins;
    }

    public Object getUserHasFavorited() {
        return userHasFavorited;
    }

    public void setUserHasFavorited(Object userHasFavorited) {
        this.userHasFavorited = userHasFavorited;
    }

    public Object getUserFlairTemplateId() {
        return userFlairTemplateId;
    }

    public void setUserFlairTemplateId(Object userFlairTemplateId) {
        this.userFlairTemplateId = userFlairTemplateId;
    }

    public String getCommunityIcon() {
        return communityIcon;
    }

    public void setCommunityIcon(String communityIcon) {
        this.communityIcon = communityIcon;
    }

    public String getBannerBackgroundImage() {
        return bannerBackgroundImage;
    }

    public void setBannerBackgroundImage(String bannerBackgroundImage) {
        this.bannerBackgroundImage = bannerBackgroundImage;
    }

    public Boolean getOriginalContentTagEnabled() {
        return originalContentTagEnabled;
    }

    public void setOriginalContentTagEnabled(Boolean originalContentTagEnabled) {
        this.originalContentTagEnabled = originalContentTagEnabled;
    }

    public String getSubmitText() {
        return submitText;
    }

    public void setSubmitText(String submitText) {
        this.submitText = submitText;
    }

    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    public void setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
    }

    public Boolean getSpoilersEnabled() {
        return spoilersEnabled;
    }

    public void setSpoilersEnabled(Boolean spoilersEnabled) {
        this.spoilersEnabled = spoilersEnabled;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public List<Integer> getHeaderSize() {
        return headerSize;
    }

    public void setHeaderSize(List<Integer> headerSize) {
        this.headerSize = headerSize;
    }

    public String getUserFlairPosition() {
        return userFlairPosition;
    }

    public void setUserFlairPosition(String userFlairPosition) {
        this.userFlairPosition = userFlairPosition;
    }

    public Boolean getAllOriginalContent() {
        return allOriginalContent;
    }

    public void setAllOriginalContent(Boolean allOriginalContent) {
        this.allOriginalContent = allOriginalContent;
    }

    public Boolean getHasMenuWidget() {
        return hasMenuWidget;
    }

    public void setHasMenuWidget(Boolean hasMenuWidget) {
        this.hasMenuWidget = hasMenuWidget;
    }

    public Object getIsEnrolledInNewModmail() {
        return isEnrolledInNewModmail;
    }

    public void setIsEnrolledInNewModmail(Object isEnrolledInNewModmail) {
        this.isEnrolledInNewModmail = isEnrolledInNewModmail;
    }

    public String getKeyColor() {
        return keyColor;
    }

    public void setKeyColor(String keyColor) {
        this.keyColor = keyColor;
    }

    public Boolean getCanAssignUserFlair() {
        return canAssignUserFlair;
    }

    public void setCanAssignUserFlair(Boolean canAssignUserFlair) {
        this.canAssignUserFlair = canAssignUserFlair;
    }

    public Double getCreated() {
        return created;
    }

    public void setCreated(Double created) {
        this.created = created;
    }

    public Integer getWls() {
        return wls;
    }

    public void setWls(Integer wls) {
        this.wls = wls;
    }

    public Boolean getShowMediaPreview() {
        return showMediaPreview;
    }

    public void setShowMediaPreview(Boolean showMediaPreview) {
        this.showMediaPreview = showMediaPreview;
    }

    public String getSubmissionType() {
        return submissionType;
    }

    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }

    public Object getUserIsSubscriber() {
        return userIsSubscriber;
    }

    public void setUserIsSubscriber(Object userIsSubscriber) {
        this.userIsSubscriber = userIsSubscriber;
    }

    public Boolean getDisableContributorRequests() {
        return disableContributorRequests;
    }

    public void setDisableContributorRequests(Boolean disableContributorRequests) {
        this.disableContributorRequests = disableContributorRequests;
    }

    public Boolean getAllowVideogifs() {
        return allowVideogifs;
    }

    public void setAllowVideogifs(Boolean allowVideogifs) {
        this.allowVideogifs = allowVideogifs;
    }

    public String getUserFlairType() {
        return userFlairType;
    }

    public void setUserFlairType(String userFlairType) {
        this.userFlairType = userFlairType;
    }

    public Boolean getCollapseDeletedComments() {
        return collapseDeletedComments;
    }

    public void setCollapseDeletedComments(Boolean collapseDeletedComments) {
        this.collapseDeletedComments = collapseDeletedComments;
    }

    public Object getEmojisCustomSize() {
        return emojisCustomSize;
    }

    public void setEmojisCustomSize(Object emojisCustomSize) {
        this.emojisCustomSize = emojisCustomSize;
    }

    public String getPublicDescriptionHtml() {
        return publicDescriptionHtml;
    }

    public void setPublicDescriptionHtml(String publicDescriptionHtml) {
        this.publicDescriptionHtml = publicDescriptionHtml;
    }

    public Boolean getAllowVideos() {
        return allowVideos;
    }

    public void setAllowVideos(Boolean allowVideos) {
        this.allowVideos = allowVideos;
    }

    public Boolean getIsCrosspostableSubreddit() {
        return isCrosspostableSubreddit;
    }

    public void setIsCrosspostableSubreddit(Boolean isCrosspostableSubreddit) {
        this.isCrosspostableSubreddit = isCrosspostableSubreddit;
    }

    public Object getSuggestedCommentSort() {
        return suggestedCommentSort;
    }

    public void setSuggestedCommentSort(Object suggestedCommentSort) {
        this.suggestedCommentSort = suggestedCommentSort;
    }

    public Boolean getCanAssignLinkFlair() {
        return canAssignLinkFlair;
    }

    public void setCanAssignLinkFlair(Boolean canAssignLinkFlair) {
        this.canAssignLinkFlair = canAssignLinkFlair;
    }

    public Boolean getAccountsActiveIsFuzzed() {
        return accountsActiveIsFuzzed;
    }

    public void setAccountsActiveIsFuzzed(Boolean accountsActiveIsFuzzed) {
        this.accountsActiveIsFuzzed = accountsActiveIsFuzzed;
    }

    public String getSubmitTextLabel() {
        return submitTextLabel;
    }

    public void setSubmitTextLabel(String submitTextLabel) {
        this.submitTextLabel = submitTextLabel;
    }

    public String getLinkFlairPosition() {
        return linkFlairPosition;
    }

    public void setLinkFlairPosition(String linkFlairPosition) {
        this.linkFlairPosition = linkFlairPosition;
    }

    public Object getUserSrFlairEnabled() {
        return userSrFlairEnabled;
    }

    public void setUserSrFlairEnabled(Object userSrFlairEnabled) {
        this.userSrFlairEnabled = userSrFlairEnabled;
    }

    public Boolean getUserFlairEnabledInSr() {
        return userFlairEnabledInSr;
    }

    public void setUserFlairEnabledInSr(Boolean userFlairEnabledInSr) {
        this.userFlairEnabledInSr = userFlairEnabledInSr;
    }

    public Boolean getAllowDiscovery() {
        return allowDiscovery;
    }

    public void setAllowDiscovery(Boolean allowDiscovery) {
        this.allowDiscovery = allowDiscovery;
    }

    public Boolean getUserSrThemeEnabled() {
        return userSrThemeEnabled;
    }

    public void setUserSrThemeEnabled(Boolean userSrThemeEnabled) {
        this.userSrThemeEnabled = userSrThemeEnabled;
    }

    public Boolean getLinkFlairEnabled() {
        return linkFlairEnabled;
    }

    public void setLinkFlairEnabled(Boolean linkFlairEnabled) {
        this.linkFlairEnabled = linkFlairEnabled;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    public Object getNotificationLevel() {
        return notificationLevel;
    }

    public void setNotificationLevel(Object notificationLevel) {
        this.notificationLevel = notificationLevel;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }

    public Object getUserFlairText() {
        return userFlairText;
    }

    public void setUserFlairText(Object userFlairText) {
        this.userFlairText = userFlairText;
    }

    public String getBannerBackgroundColor() {
        return bannerBackgroundColor;
    }

    public void setBannerBackgroundColor(String bannerBackgroundColor) {
        this.bannerBackgroundColor = bannerBackgroundColor;
    }

    public Boolean getShowMedia() {
        return showMedia;
    }

    public void setShowMedia(Boolean showMedia) {
        this.showMedia = showMedia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getUserIsContributor() {
        return userIsContributor;
    }

    public void setUserIsContributor(Object userIsContributor) {
        this.userIsContributor = userIsContributor;
    }

    public Boolean getOver18() {
        return over18;
    }

    public void setOver18(Boolean over18) {
        this.over18 = over18;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubmitLinkLabel() {
        return submitLinkLabel;
    }

    public void setSubmitLinkLabel(String submitLinkLabel) {
        this.submitLinkLabel = submitLinkLabel;
    }

    public Object getUserFlairTextColor() {
        return userFlairTextColor;
    }

    public void setUserFlairTextColor(Object userFlairTextColor) {
        this.userFlairTextColor = userFlairTextColor;
    }

    public Boolean getRestrictCommenting() {
        return restrictCommenting;
    }

    public void setRestrictCommenting(Boolean restrictCommenting) {
        this.restrictCommenting = restrictCommenting;
    }

    public Object getUserFlairCssClass() {
        return userFlairCssClass;
    }

    public void setUserFlairCssClass(Object userFlairCssClass) {
        this.userFlairCssClass = userFlairCssClass;
    }

    public Boolean getAllowImages() {
        return allowImages;
    }

    public void setAllowImages(Boolean allowImages) {
        this.allowImages = allowImages;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getWhitelistStatus() {
        return whitelistStatus;
    }

    public void setWhitelistStatus(String whitelistStatus) {
        this.whitelistStatus = whitelistStatus;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getCreatedUtc() {
        return createdUtc;
    }

    public void setCreatedUtc(Double createdUtc) {
        this.createdUtc = createdUtc;
    }

    public List<Integer> getBannerSize() {
        return bannerSize;
    }

    public void setBannerSize(List<Integer> bannerSize) {
        this.bannerSize = bannerSize;
    }

    public String getMobileBannerImage() {
        return mobileBannerImage;
    }

    public void setMobileBannerImage(String mobileBannerImage) {
        this.mobileBannerImage = mobileBannerImage;
    }

    public Object getUserIsModerator() {
        return userIsModerator;
    }

    public void setUserIsModerator(Object userIsModerator) {
        this.userIsModerator = userIsModerator;
    }

}
