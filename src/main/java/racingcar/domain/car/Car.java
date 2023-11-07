package racingcar.domain.car;

import racingcar.domain.game.strategy.MoveStrategy;

public class Car {
    private final Position position;

    public Car() {
        this.position = new Position();
    }

    public int getPosition() {
        return this.position.getPosition();
    }

    public void move(final MoveStrategy moveStrategy) {
        this.position.move(moveStrategy.movePosition());
    }
}
