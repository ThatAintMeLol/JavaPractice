class CounterTester {
    public static void main(String args[]){
    Counter counter1 = new Counter();

        counter1.click();
        counter1.click();
        counter1.click();

        System.out.println("current clicks: " + counter1.getClicks());

        counter1.click();

        System.out.println("current clicks after one more click: " + counter1.getClicks());

        counter1.reset();

        System.out.println("current clicks after reset: " + counter1.getClicks());
    }
}
