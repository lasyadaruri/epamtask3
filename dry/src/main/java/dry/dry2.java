package dry;

	public class dry2 {

		public void labclass() {

		System.out.println("lab class going on now");
		performOtherTasks();
		}

		public void theoryclass() {

		System.out.println("theory class going on now");
		performOtherTasks();
		}

		public void performOtherTasks() {

		System.out.println("Attendence is taken");
		System.out.println("Learning is done");
		System.out.println("teaching is done");
		
		}

		} 

class Maindry{
	public static void main(String[] args) {
		dry2 obj=new dry2();
		obj.labclass();
		obj.theoryclass();
	}

		
		
	}

