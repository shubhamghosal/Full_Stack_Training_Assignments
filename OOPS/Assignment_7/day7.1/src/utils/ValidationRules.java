package utils;

import custom_exceptions.SpeedOutOfRangeException;

public class ValidationRules {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		System.out.println("in static init block : ValidationRules");
		MIN_SPEED=40;
		MAX_SPEED=80;
	}
//add a static method to validate vehicle's speed
	public static void validateSpeed(int speed)  throws SpeedOutOfRangeException
	{
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow!!!!!");
		if(speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("You are driving too fast FATAL !!!!!");
		System.out.println("speed within the range....");
			
	}
}
