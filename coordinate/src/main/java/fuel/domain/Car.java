package fuel.domain;

public abstract class Car {

    int movingDistance; // 대략적인 이동거리
    CarModel carModel;

    public Car(int dist, CarModel carModel) {
        this.movingDistance = dist;
        this.carModel = carModel;
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    public double getDistancePerLiter(){
        return carModel.getFuelEfficiency();
    }

    /**
     * 여행하려는 거리
     */
    public double getTripDistance(){
        return this.movingDistance;
    }

    /**
     * 차종의 이름
     */
    public String getName() {
        return carModel.getModelName();
    }

    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }

    @Override
    public String toString() {
        return getName() + " : " + ((int)getChargeQuantity()) +"리터";
    }
}
