package tatar.companiese.kamil.java2025.abstract_classes;

public class CdnImageService extends BaseImageService {
    private final CdnServiceConnection cdnServiceConnection;
    public CdnImageService(CdnServiceConnection cdnServiceConnection){
        this.cdnServiceConnection = cdnServiceConnection;
    }
    @Override
    protected String getImageUrlFromRemoteStorage(long id){
        return cdnServiceConnection.getImageUrl(id);
    }
}
class CdnServiceConnection {
    public String getImageUrl(long id){
        //1. connect to CDN resource
        //2. get image URL
        return "https://cdn.com/images/cats/#" + id;
    }
}