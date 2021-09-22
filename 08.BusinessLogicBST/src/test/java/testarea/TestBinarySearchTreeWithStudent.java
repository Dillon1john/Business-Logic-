package testarea;

import edu.citytech.cst.s23778215.ds.BinarySearchTree;
import edu.citytech.cst.s23778215.ds.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinarySearchTreeWithStudent {

//    static BinarySearchTree bst = new BinarySearchTree<String>();
    static BinarySearchTree<Student> bst = new BinarySearchTree<Student>();

    // static StringBinarySearchTree stringBinarySearchTree = new StringBinarySearchTree();

    @BeforeEach
    void setUp() {



        bst.insert(new Student(1000, new float[] {100f,100f,100f}));
        bst.insert(new Student(1001, new float[] {98,100f,100f}));
        bst.insert(new Student(1002, new float[] {96,100f,100f}));
        bst.insert(new Student(1003, new float[] {94,100f,100f}));
        bst.insert(new Student(1004, new float[] {92,100f,100f}));


    }


    @Test
    @DisplayName("Max grade is student 100")
    void tMax() {


        var actual = bst.max().getGrades()[0];
        var expected = 100;

        assertEquals(expected, actual);


    }

    @Test
    @DisplayName("Size Check")
    void t1() {


        var actual = bst.size();
        var expected = 5;

        assertEquals(expected, actual);


    }
    @Test
    @DisplayName("Smallest grade 92")
    void t2() {


        var actual = bst.min().getGrades()[0];
        var expected = 92;

        assertEquals(expected, actual);


    }
}

//    @Test
//    @DisplayName("Size Check")
//    void t2(){
//
//
//        var actual = bst.size();
//        var expected = 5;
//        assertEquals(expected,actual);
//
//
//    }

//
//    @Test
//    @DisplayName("String Check")
//    void t3(){
//
//
//
//       stringBinarySearchTree.insert("book");
//       stringBinarySearchTree.insert("World");
//       stringBinarySearchTree.insert("book");
//       stringBinarySearchTree.insert("World");
//       stringBinarySearchTree.insert("car");
//       //stringBinarySearchTree.insert("four");
//        var actual = stringBinarySearchTree.size();
//        var expected = 3;
//        assertEquals(expected,actual);
//
//
//    }
//    @Test
//    @DisplayName("String Check")
//    void t4(){
//
//
//
//        stringBinarySearchTree.insert("book");
//        stringBinarySearchTree.insert("World");
//        stringBinarySearchTree.insert("book");
//        stringBinarySearchTree.insert("World");
//        stringBinarySearchTree.insert("car");
//        stringBinarySearchTree.insert("Dillon");
//        stringBinarySearchTree.insert("John");
//        stringBinarySearchTree.insert("Dillon");
//        stringBinarySearchTree.insert("John");
//        //stringBinarySearchTree.insert("four");
//        var actual = stringBinarySearchTree.size();
//        var expected = 5;
//
//       // stringBinarySearchTree.toList().forEach(System.out::println);
//        assertEquals(expected,actual);
//
//
//    }
//}
