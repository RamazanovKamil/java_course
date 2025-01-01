package tatar.companiese.kamil.java2025.abstract_classes;

public abstract class BaseImageService {
    public String getImageUrlById(long id) {
        String url = getImageUrlFromRemoteStorage(id);
        validateUrl(url);
        return encodeUrl(url);
    }

    protected abstract String getImageUrlFromRemoteStorage(long id);

    private void validateUrl(String url){
        //validating process
    }
    private String encodeUrl(String url){
        //encoding process
        return url;
    }
}
