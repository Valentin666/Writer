public class Speaker {

    private GoSpeachWriter writer;

    public  Speaker(GoSpeachWriter writer){
        this.writer=writer;
    }

    public void speak(){
        System.out.println(writer.getSpeach());

    }

    public static void main(String[] args) {
//        HelloSpeachWriter writer = new HelloSpeachWriter();
//        Speaker speaker = new Speaker(writer);
        GoSpeachWriter writer2 = new GoSpeachWriter();
        Speaker speaker2 = new Speaker(writer2);
        speaker2.speak();

    }
}
