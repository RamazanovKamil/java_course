package tatar.companiese.kamil.java2025.abstract_classes;

public class S3ImageService extends BaseImageService{
    private final S3ServiceConnection s3ServiceConnection;
    public S3ImageService(S3ServiceConnection s3ServiceConnection){
        this.s3ServiceConnection = s3ServiceConnection;
    }
    @Override
    protected String getImageUrlFromRemoteStorage(long id) {
        return s3ServiceConnection.getImageUrl(id);
    }
}
class S3ServiceConnection {
    public String getImageUrl(long id) {
        try {
            //1. connect to Amazon S3
            //2. get image URL
        } catch (RuntimeException e) {
            System.out.println("Connection error. May be we have some troubles with network");
            throw new S3ImageServiceConnectionException("Details of this exception: ...");
        }
        return "https://cdn.com/images/cats/#" + id;
    }
}
