package testarea;

import edu.citytech.cst.project.ds.BinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinarySearchTreeWithStockNames {

//    static BinarySearchTree bst = new BinarySearchTree<String>();
    static BinarySearchTree<String> bst = new BinarySearchTree<String>();

    // static StringBinarySearchTree stringBinarySearchTree = new StringBinarySearchTree();

    @BeforeEach
    void setUp() {



        bst.insert("NRZ");
        bst.insert("IBM");
        bst.insert("TSLA");
        bst.insert("AMD");
        bst.insert("MSTF");
        bst.insert("ZM");
        bst.insert("AAPL");

    }


    @Test
    @DisplayName("ZM is the max")
    void tMax() {


        var actual = bst.max();
        var expected = "ZM";

        assertEquals(expected, actual);


    }

    @Test
    @DisplayName("Size Check")
    void t1() {


        var actual = bst.size();
        var expected = 7;

        assertEquals(expected, actual);


    }
    @Test
    @DisplayName("Smallest stock AAPL")
    void t2() {


        var actual = bst.min();
        var expected = "AAPL";

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
