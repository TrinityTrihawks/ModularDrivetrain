package org.usfirst.frc.team4215.robot.wheels;

import java.util.HashSet;

public class WheelSet {
public final String name;
	
	//the set of wheels included in this group
	private HashSet<OneWheel> wheelSet;
	
	/**
	 * @param name of the WheelSet
	 * @param wheelSetArray array of all the wheels to be included
	 */
	public WheelSet(String name, OneWheel[] wheelSetArray) {
		this.name = name;
		
		//make a HashSet from the provided array of Wheels
		wheelSet = new HashSet<OneWheel>();
		for(OneWheel w : wheelSetArray) {
			wheelSet.add(w);
		}
	}
	
	public void set(double power) {
		//set power to each wheel in the set
		System.out.println(name + " (WheelSet): will set power to " + power);
		wheelSet.forEach(wheel -> wheel.set(power));
	}

	public HashSet<OneWheel> getHashSet() {
		return wheelSet;
	}
	
	
	public WheelSnapshot getSnapshot() {
		//create a snapshot of this set of wheels
		OneWheel[] wheelsArray = new OneWheel[wheelSet.size()];
		wheelSet.toArray(wheelsArray); //copies the hashset to the array
		return(new WheelSnapshot(wheelsArray));
		
	}
}
