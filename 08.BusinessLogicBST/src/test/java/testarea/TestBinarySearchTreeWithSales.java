package testarea;

import edu.citytech.cst.project.ds.BinarySearchTree;
import edu.citytech.cst.project.ds.model.Sales;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinarySearchTreeWithSales {

//    static BinarySearchTree bst = new BinarySearchTree<String>();
    List<Sales> list = new LinkedList<>();
    BinarySearchTree<Sales> bst = new BinarySearchTree<>(list::add);

    //static StringBinarySearchTree stringBinarySearchTree = new StringBinarySearchTree();

//    @BeforeEach
//    void setUp() {
//
//
//        bst.insert(45);
//        bst.insert(30);
//        bst.insert(25);
//        bst.insert(100);
//        bst.insert(200);
//
//        bst.insert(45);
//        bst.insert(200);
//        bst.insert(200);
//        bst.insert(200);
//    }

    @Test
    @DisplayName("200 is the max")
    void tMax() {
        var actual = bst.max();
        var expected = 200;
        assertEquals(expected, actual);


    }

//    @Test
//    @DisplayName("ZM is the max")
//    void tMax() {
//
//
//        var actual = bst.max();
//        var expected = "ZM";
//
//        assertEquals(expected, actual);
//
//
//    }

    @Test
    @DisplayName("Size Check")
    void t1() {


        var actual = bst.size();
        var expected = 7;
        System.out.println(actual);
        assertEquals(expected, actual);


    }
//    @Test
//    @DisplayName("find")
//    void tFind() {
//
//
//        var actual = bst.find();
//        System.out.println(actual);
////        var expected = bst;
////
////        assertEquals(expected, actual);


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
