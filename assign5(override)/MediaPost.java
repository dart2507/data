class MediaPost{
    void post(){
        System.out.println("Posteing on media post.....");
    }
    void comment(){
        System.out.println("Commenting on the post .....");
    }
}

class TextPost extends MediaPost{
    @Override
    void post(){
        System.out.println("Posting a text message..");
    }
    void comment(){
        System.out.println("Commenting on the text post....");
    }
}

class ImagePost extends MediaPost{
    @Override

    void post(){
        System.out.println("Posting an image....");
    }
    void comment(){
        System.out.println("Commenting on the image post....");
    }
}