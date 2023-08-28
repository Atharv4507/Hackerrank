import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code

public class h40_javaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter how many name you want: ");
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		System.out.println("Enter following detail**\n");
		System.out.println("id	fname	cgpa");
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
       Collections.sort(studentList, new Comparator<Student>() {
              @Override
               public int compare(Student s1, Student s2) {
                    if(s2.getCgpa()>s1.getCgpa()){
                        return 1;
                    }else if(s2.getCgpa()<s1.getCgpa()){
                        return -1;
                    }
                    return s1.getFname().compareTo(s2.getFname());
                }
        });
		System.out.println("Name followed by more cgpa are:");
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
        in.close();
	}
}
