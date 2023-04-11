public class Main {
    public static void main(String[] args) {
       MovablePoint movablePoint = new MovablePoint(1,3,4,5);
        System.out.println(movablePoint);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);
    }
}