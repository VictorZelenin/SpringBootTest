package test.model;

/**
 * Created by victor on 19.10.16.
 */
public class Website {
    private final String id;
    private final String website;
    private final String iconImageUrl;
    private final String title;
    private final String description;

    public Website(String id, String website, String iconImageUrl, String title, String description) {
        this.id = id;
        this.website = website;
        this.iconImageUrl = iconImageUrl;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getWebsite() {
        return website;
    }

    public String getIconImageUrl() {
        return iconImageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
