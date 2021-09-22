package testarea;

import edu.citytech.cst.project.ds.BinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinarySearchTreeWABC {

     List<String> list = new LinkedList<>();

     BinarySearchTree<String> bst = new BinarySearchTree<>(list::add);



    @BeforeEach
    void setUp() {


        bst.insert("H");
        bst.insert("D");
        bst.insert("K");
        bst.insert("A");
        bst.insert("F");
        bst.insert("I");
        bst.insert("Z");
        bst.insert("G");

    }



    @Test
    @DisplayName("Size Check")
    void t1() {


        var actual = bst.size();
        var expected = 8;

        assertEquals(expected, actual);


    }
    @Test
    @DisplayName("find")
    void tFind() {


        var status = bst.find("A");
        var actual = list.size();

//        System.out.println(actual);
        var expected = 3;

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("finding G")
    void tFind2() {


        var status = bst.find("G");
        var actual = list.size();

//        System.out.println(actual);
        var expected = 4;

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
