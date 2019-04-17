package com.github.javiersantos.appupdater.objects;

import java.net.URL;

public class Update {
    private String version;
    private String versionCode;
    private String releaseNotes;
    private URL apk;

    public Update() {}

    public Update(String latestVersion, String latestVersionCode) {
        this.version = latestVersion;
        this.versionCode = latestVersionCode;
    }

    public Update(String latestVersion, URL apk) {
        this.version = latestVersion;
        this.apk = apk;
    }

    public Update(String latestVersion, String releaseNotes, URL apk) {
        this.version = latestVersion;
        this.apk = apk;
        this.releaseNotes = releaseNotes;
    }

    public Update(String latestVersion, String latestVersionCode, String releaseNotes, URL apk) {
        this(latestVersion, releaseNotes, apk);
        this.versionCode = latestVersionCode;
    }

    public String getLatestVersion() {
        return version;
    }

    public void setLatestVersion(String latestVersion) {
        this.version = latestVersion;
    }

    public String getLatestVersionCode() {
        return versionCode;
    }

    public void setLatestVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getReleaseNotes() {
        return releaseNotes;
    }

    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    public URL getUrlToDownload() {
        return apk;
    }

    public void setUrlToDownload(URL apk) {
        this.apk = apk;
    }
}
