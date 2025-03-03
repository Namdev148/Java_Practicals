public class StringPerformance {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You haven't provided the command line arguments");
            return;
        }

        int num = Integer.parseInt(args[0]); 

        long startTimeOfString = System.nanoTime();
        String str = "Hello";
        for (int i = 0; i <num; i++) {
            str = str + " World";  
        }
        long endTimeOfString = System.nanoTime();
        long timeString = endTimeOfString - startTimeOfString;

        long startTimeOfBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer("Hello");
        for (int i = 0; i < num; i++) {
            stringBuffer.append(" World");
        }
        long endTimeOfBuffer = System.nanoTime();
        long timeBuffer = endTimeOfBuffer - startTimeOfBuffer;

        long startTimeOfBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder("Hello");
        for (int i = 0; i < num; i++) {
            stringBuilder.append(" World");
        }
        long endTimeOfBuilder = System.nanoTime();
        long timeBuilder = endTimeOfBuilder - startTimeOfBuilder;

        System.out.println("Operations: " + num);
        System.out.println("Time by String: " + timeString );
        System.out.println("Time by StringBuffer: " + timeBuffer );
        System.out.println("Time by StringBuilder: " + timeBuilder );

        if (timeString > timeBuffer && timeString > timeBuilder) {
            System.out.println("String is the slowest.");
        }
        if (timeBuffer > timeBuilder) {
            System.out.println("StringBuffer is slower than StringBuilder.");
        } else {
            System.out.println("StringBuilder is the fastest.");
        }
    }
}

