function FindProxyForURL(url, host) {
    if (url.startsWith("http:")) {
        return "PROXY 192.168.158.100:8081";
    }
    return "DIRECT";
}
