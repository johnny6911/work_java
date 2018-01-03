package obj.constructor;

public class Car {
    
    private int maxSpeed;		//최고 속도
    private String brandName;	//브랜드이름
    private int speed;			//현재 속도
    
    //브랜드 이름을 지정하는 생성자
    public Car(String brandName) {
        this.brandName = brandName;
    }
    //브랜드 이름과 최고속도를 지정하는 생성자
    public Car(String brandName, int maxSpeed) {
        this(brandName);
        this.maxSpeed = maxSpeed;
    }
    
    public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	//속도 관련 메소드
    public int speedUp() {
    	int tempSpeed = this.speed;
    	tempSpeed += 30;
    	
    	// 최대 속도보다 더 높다면 이전 속도 유지
    	if (tempSpeed > this.maxSpeed) {
    		return this.speed;
    	}
    	//최대 속도보다 같거나 작다면 현재 속도를 갱신
    	this.speed = tempSpeed;
    	
        return this.speed;
    }
    
    public int speedDown() {
    	int tempSpeed = this.speed;
        tempSpeed -= 20;
        
        if (tempSpeed <= 0) {
        	return 0;
        }
        
        // 현재 속도를 계산한 속도로 갱신
        this.speed = tempSpeed;
        
        return this.speed;
        
    }
    
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public static void main(String[] args) {
        Car mycar = new Car("포르쉐", 300);
        mycar.speedUp();
        mycar.speedUp();
        System.out.print("차종: " + mycar.brandName);
        System.out.print(", 최고 속도: " + mycar.getMaxSpeed());
        System.out.println(", 현재 속도: " + mycar.speedDown());
    }
}
