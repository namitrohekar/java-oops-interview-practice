package oops10;

import java.util.*;

class Student {
    private long id;
    private String name;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "[ Id : " + id + " , Name : " + name + " ]";
    }
}

interface StudentStore {
    void save(Student student);
    Optional<Student> findById(long id);
    Collection<Student> findAll();
}

class MapBasedStudentStore implements StudentStore {
    private final Map<Long, Student> data = new HashMap<>();

    @Override
    public void save(Student student) {
        if (data.containsKey(student.getId())) {
            System.out.println("MapStore Error -> Id " + student.getId() + " already exists.");
            return;
        }
        data.put(student.getId(), student);
        System.out.println("MapStore: Saved " + student.getName());
    }

    @Override
    public Optional<Student> findById(long id) {
        return Optional.ofNullable(data.get(id));
    }

    @Override
    public Collection<Student> findAll() {
        return data.values();
    }
}


class ListBasedStudentStore implements StudentStore {
    private final List<Student> data = new ArrayList<>();

    @Override
    public void save(Student student) {
       
        boolean exists = data.stream().anyMatch(s -> s.getId() == student.getId());
        if (exists) {
            System.out.println("ListStore Error -> Id " + student.getId() + " already exists.");
            return;
        }
        data.add(student);
        System.out.println("ListStore: Saved " + student.getName());
    }

    @Override
    public Optional<Student> findById(long id) {
        return data.stream().filter(s -> s.getId() == id).findFirst();
    }

    @Override
    public Collection<Student> findAll() {
        return data;
    }
}


class StudentRepository {
    private final StudentStore store;

    
    public StudentRepository(StudentStore store) {
        this.store = store;
    }

    public void add(Student s) { 
    	store.save(s);
    }
    public Collection<Student> getAll() { 
    	return store.findAll();
    }
}


class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public void enrollStudent(long id, String name) {
        if (id <= 0 || name == null || name.isBlank()) {
            System.out.println("Service Error: Invalid student data.");
            return;
        }
        repository.add(new Student(id, name));
    }
}

public class CollectionDIPDemo {
    public static void main(String[] args) {
        
        System.out.println("Testing with Map-Based Storage");
        StudentStore mapStore = new MapBasedStudentStore();
        StudentRepository repo1 = new StudentRepository(mapStore);
        StudentService service1 = new StudentService(repo1);

        service1.enrollStudent(1, "Namit");
        service1.enrollStudent(1, "Duplicate"); 
        System.out.println("Final List: " + repo1.getAll());

        System.out.println(" Testing with List-Based Storage ");
        
        StudentStore listStore = new ListBasedStudentStore();
        StudentRepository repo2 = new StudentRepository(listStore);
        StudentService service2 = new StudentService(repo2);

        service2.enrollStudent(2, "Rohekar");
        service2.enrollStudent(2, "Duplicate"); 
        System.out.println("Final List: " + repo2.getAll());
    }
}