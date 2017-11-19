
public class Demo {

	public static void main(String[] args) {
		DoublyEndedLinkedList list = new DoublyEndedLinkedList();
		list.insertLast(1);
		list.insertLast(17);
		list.insertLast(28);
		Link loopStartPoint = new Link(154);
		list.insertLast(loopStartPoint);
		list.insertLast(18);
		list.insertLast(91);
		list.insertLast(48);
		list.insertLast(loopStartPoint);
		
		Link loopSP = list.getLoopStartPointByHashing();
		System.out.println("Loop start point By Hashing: " + ( (loopSP != null) ? loopSP.getData() : null) );
		
		System.out.println();
		
		System.out.println("Is List Cyclic By FastRunner/SlowRunner: " + list.isLoopCircularByFlowRunnerFastRunner());

		
		
	}

}
