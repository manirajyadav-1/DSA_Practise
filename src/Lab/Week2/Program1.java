class MyTubeVideo {
    private String vid;
    private String vtitle;
    private String vdescription;
    private int duration; // in seconds
    private int views;
    private int likes;
    private int shares;
    private int subscribers;
    private boolean isPlaying;

    // Constructor
    public MyTubeVideo(String vid, String vtitle, String vdescription, int duration) {
        this.vid = vid;
        this.vtitle = vtitle;
        this.vdescription = vdescription;
        this.duration = duration;
        this.views = 0;
        this.likes = 0;
        this.shares = 0;
        this.subscribers = 0;
        this.isPlaying = false;
    }

    // Play method
    public void play() {
        if (!isPlaying) {
            isPlaying = true;
            views++;
            System.out.println("Playing: " + vtitle);
        } else {
            System.out.println(vtitle + " is already playing.");
        }
    }

    // Pause method
    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Paused: " + vtitle);
        } else {
            System.out.println(vtitle + " is not playing.");
        }
    }

    // Stop method
    public void stop() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Stopped: " + vtitle);
        } else {
            System.out.println(vtitle + " is already stopped.");
        }
    }

    // Like method
    public void like() {
        likes++;
        System.out.println("Liked! Total likes: " + likes);
    }

    // Share method
    public void share() {
        shares++;
        System.out.println("Shared! Total shares: " + shares);
    }

    // Subscribe method
    public void subscribe() {
        subscribers++;
        System.out.println("Subscribed! Total subscribers: " + subscribers);
    }

    // Display video details
    public void showDetails() {
        System.out.println("\nVideo ID: " + vid);
        System.out.println("Title: " + vtitle);
        System.out.println("Description: " + vdescription);
        System.out.println("Duration: " + duration + " seconds");
        System.out.println("Views: " + views);
        System.out.println("Likes: " + likes);
        System.out.println("Shares: " + shares);
        System.out.println("Subscribers: " + subscribers);
        System.out.println("Playing status: " + (isPlaying ? "Playing" : "Not Playing") + "\n");
    }
}
class Program1{

    public static void main(String[] args) {
        MyTubeVideo video = new MyTubeVideo("vid123", "Learn Java", "A tutorial on Java basics", 600);

        video.play();
        video.pause();
        video.like();
        video.share();
        video.subscribe();
        video.play();
        video.stop();

        video.showDetails();
    }
}
