//RA2211003010001 Week 6 Q2
public class TrafficLight1 {
        // Constants for traffic light colors
        public static final String RED = "Red";
        public static final String GREEN = "Green";
        public static final String YELLOW = "Yellow";

        private String color;
        private int durationInSeconds;

        public TrafficLight1(String initialColor, int initialDuration) {
            this.color = initialColor;
            this.durationInSeconds = initialDuration;
        }

        public void changeColor(String newColor) {
            this.color = newColor;
        }

        public String getColor() {
            return this.color;
        }

        public int getDurationInSeconds() {
            return this.durationInSeconds;
        }

        public boolean isRed() {
            return this.color.equals(RED);
        }

        public boolean isGreen() {
            return this.color.equals(GREEN);
        }

        public static void main(String[] args) {
            TrafficLight1 trafficLight = new TrafficLight1(RED, 30);
            System.out.println("Initial Color: " + trafficLight.getColor());
            System.out.println("Is it Red? " + trafficLight.isRed());
            System.out.println("Is it Green? " + trafficLight.isGreen());

            trafficLight.changeColor(GREEN);
            System.out.println("New Color: " + trafficLight.getColor());
            System.out.println("Is it Red? " + trafficLight.isRed());
            System.out.println("Is it Green? " + trafficLight.isGreen());
        }
    }

