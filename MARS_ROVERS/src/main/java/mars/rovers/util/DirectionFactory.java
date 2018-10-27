package main.java.mars.rovers.util;

import org.springframework.stereotype.Component;

import main.java.mars.rovers.model.DirectionModel;

@Component
public class DirectionFactory {

//	private static DirectionFactory factory = null;
//
//	static Object locker = new Object();
//
//	private DirectionFactory() {
//
//	}
//
//	public static DirectionFactory getInstance() {
//		synchronized (locker) {
//			if (factory == null)
//				factory = new DirectionFactory();
//		}
//		return factory;
//	}

	public DirectionModel getInitDirectionModel(char direction) {
		
		DirectionModel directionModelN = new DirectionModel(Direction.north);
		DirectionModel directionModelS = new DirectionModel(Direction.south);
		DirectionModel directionModelE = new DirectionModel(Direction.east);
		DirectionModel directionModelW = new DirectionModel(Direction.west);
		
		directionModelN.setNext(directionModelE);
		directionModelN.setPrev(directionModelW);
		
		directionModelS.setNext(directionModelW);
		directionModelS.setPrev(directionModelE);
		
		directionModelE.setNext(directionModelS);
		directionModelE.setPrev(directionModelN);
		
		directionModelW.setNext(directionModelN);
		directionModelW.setPrev(directionModelS);
		
		DirectionModel res = null;
		switch (direction) {
		case Direction.north:
			res =  directionModelN;
			break;
		case Direction.south:
			res =  directionModelS;
			break;
		case Direction.west:
			res =  directionModelW;
			break;
		case Direction.east:
			res =  directionModelE;
			break;
		default:
			break;
		}
		return res;
	}
}
