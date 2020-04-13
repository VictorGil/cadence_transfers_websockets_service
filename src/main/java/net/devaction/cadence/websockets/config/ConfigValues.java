package net.devaction.cadence.websockets.config;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Víctor Gil
 *
 * since March 2020
 */
public class ConfigValues {

    @JsonProperty("websockets_server_host")
    private String websocketsServerHost;

    @JsonProperty("websockets_server_port")
    private int websocketsServerPort;

    @JsonProperty("websockets_context_path")
    private String websocketsContextPath;

    @JsonProperty("cadence_domain")
    private String cadenceDomain;

    @Override
    public String toString() {
        return "ConfigValues [websocketsServerHost=" + websocketsServerHost + ", websocketsServerPort=" + websocketsServerPort
                + ", websocketsContextPath=" + websocketsContextPath + ", cadenceDomain=" + cadenceDomain + "]";
    }

    public String getWebsocketsServerHost() {
        return websocketsServerHost;
    }

    public void setWebsocketsServerHost(String websocketsServerHost) {
        this.websocketsServerHost = websocketsServerHost;
    }

    public int getWebsocketsServerPort() {
        return websocketsServerPort;
    }

    public void setWebsocketsServerPort(int websocketsServerPort) {
        this.websocketsServerPort = websocketsServerPort;
    }

    public String getWebsocketsContextPath() {
        return websocketsContextPath;
    }

    public void setWebsocketsContextPath(String websocketsContextPath) {
        this.websocketsContextPath = websocketsContextPath;
    }

    public String getCadenceDomain() {
        return cadenceDomain;
    }

    public void setCadenceDomain(String cadenceDomain) {
        this.cadenceDomain = cadenceDomain;
    }
}
