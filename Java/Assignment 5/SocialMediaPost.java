class SocialMediaPost {

    void post() {
        System.out.println("Posting a social media post...");
    }

    void comment() {
        System.out.println("Commenting on a social media post...");
    }
}

class TextPost extends SocialMediaPost {

    @Override
    void post() {
        System.out.println("Posting a text message...");
    }

    @Override
    void comment() {
        System.out.println("Commenting on text post...");
    }
}

class ImagePost extends SocialMediaPost {

    @Override
    void post() {
        System.out.println("Uploading an image...");
    }

    @Override
    void comment() {
        System.out.println("Commenting on image post...");
    }
}