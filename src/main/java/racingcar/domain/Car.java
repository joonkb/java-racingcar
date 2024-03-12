package racingcar.domain;

public class Car {
    private int position = 0;

    public Car(Car car) {
        this.position = car.position;
    }

    public Car() {
    }

    public void move(MoveType moveType) {
        position += moveType.getMovePosition();
    }

    public int getPosition() {
        return position;
    }
}
