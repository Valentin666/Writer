public class Speaker {

    private SpeachWriter writer;

    void setWriter(SpeachWriter writer) {
        this.writer = writer;
    }

    public void speak(){
        System.out.println(writer.getSpeach());

    }

    public static void main(String[] args) {
        SpeachWriter writer = new HelloSpeachWriter();
        Speaker speaker = new Speaker();
        speaker.setWriter(writer);
        speaker.speak();
        SpeachWriter writer2 = new GoSpeachWriter();
        speaker.setWriter(writer2);
        speaker.speak();

    }
}
