package tatar.companiese.kamil.java2025.abstract_classes;

public class MainServices {
    public static void main(String[] args) {
        CdnImageService cdnImageService = new CdnImageService(new CdnServiceConnection());
        S3ImageService s3ImageService = new S3ImageService(new S3ServiceConnection());
        String url1 = cdnImageService.getImageUrlById(648L);
        String url2 = s3ImageService.getImageUrlById(164L);
        System.out.println(url1);
        System.out.println(url2);
    }
}
