public class Speaker {

    public Speaker() {
    }

    private GoSpeachWriter writer = new GoSpeachWriter();

    public void speak(){
        System.out.println(writer.getSpeach());

    }

    public static void main(String[] args) {
        Speaker speaker = new Speaker();

        speaker.speak();

    }
}
